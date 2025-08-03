import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class prefixEvaluationAndConversion {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v1 = vs.pop(); // left
                int v2 = vs.pop(); // right
                int val = operation(v1, v2, ch);
                vs.push(val);

                String iv1 = is.pop(); // left
                String iv2 = is.pop(); // right
                String ival = "(" + iv1 + ch + iv2 + ")";
                is.push(ival);

                String pv1 = ps.pop(); // left
                String pv2 = ps.pop(); // right
                String pval = pv1 + pv2 + ch;
                ps.push(pval);
            } else {
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }
        }

        System.out.println(vs.pop());  // evaluated result
        System.out.println(is.pop());  // infix
        System.out.println(ps.pop());  // postfix
    }

    public static int operation(int v1, int v2, char op) {
        if (op == '+') return v1 + v2;
        else if (op == '-') return v1 - v2;
        else if (op == '*') return v1 * v2;
        else return v1 / v2;
    }
}
