import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class postfixEvaluationAndConversion {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> vs = new Stack<>();   // value stack
        Stack<String> is = new Stack<>();    // infix stack
        Stack<String> ps = new Stack<>();    // prefix stack

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // Value evaluation
                int v2 = vs.pop();
                int v1 = vs.pop();
                int val = operation(v1, v2, ch);
                vs.push(val);

                // Infix conversion
                String iv2 = is.pop(); // right
                String iv1 = is.pop(); // left
                String ival = "(" + iv1 + ch + iv2 + ")";
                is.push(ival);

                // Prefix conversion
                String pv2 = ps.pop(); // right
                String pv1 = ps.pop(); // left
                String pval = ch + pv1 + pv2;
                ps.push(pval);
            } else {
                // Operand
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }
        }

        System.out.println(vs.pop()); // evaluated value
        System.out.println(is.pop()); // infix
        System.out.println(ps.pop()); // prefix
    }

    public static int operation(int v1, int v2, char op) {
        if (op == '+') return v1 + v2;
        else if (op == '-') return v1 - v2;
        else if (op == '*') return v1 * v2;
        else return v1 / v2;
    }
}
