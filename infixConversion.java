import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class infixConversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops.push(ch);
            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                post.push(ch + "");
                pre.push(ch + "");
            } else if (ch == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    process(post, pre, ops);
                }
                if (!ops.isEmpty()) ops.pop(); // remove '('
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!ops.isEmpty() && ops.peek() != '(' && precedence(ops.peek()) >= precedence(ch)) {
                    process(post, pre, ops);
                }
                ops.push(ch);
            }
        }

        while (!ops.isEmpty()) {
            process(post, pre, ops);
        }

        System.out.println(post.peek());  // Postfix
        System.out.println(pre.peek());   // Prefix
    }

    public static void process(Stack<String> post, Stack<String> pre, Stack<Character> ops) {
        char op = ops.pop();

        String postv2 = post.pop();
        String postv1 = post.pop();
        post.push(postv1 + postv2 + op);

        String prev2 = pre.pop();
        String prev1 = pre.pop();
        pre.push(op + prev1 + prev2);
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }
}
