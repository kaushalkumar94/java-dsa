 import java.util.*;

public class InfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String exp = sc.nextLine();
        System.out.println("Result: " + evaluate(exp));
    }

    public static int evaluate(String exp) {
        Stack<Integer> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // Skip whitespaces
            if (ch == ' ') continue;

            // If digit (could be multi-digit)
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    num = num * 10 + (exp.charAt(i) - '0');
                    i++;
                }
                values.push(num);
                i--; // adjust index
            }

            // Opening bracket
            else if (ch == '(') {
                operators.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {
                while (operators.peek() != '(') {
                    int val2 = values.pop();
                    int val1 = values.pop();
                    char op = operators.pop();
                    values.push(applyOp(val1, val2, op));
                }
                operators.pop(); // pop '('
            }

            // Operator
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    int val2 = values.pop();
                    int val1 = values.pop();
                    char op = operators.pop();
                    values.push(applyOp(val1, val2, op));
                }
                operators.push(ch);
            }
        }

        // Final evaluation
        while (!operators.isEmpty()) {
            int val2 = values.pop();
            int val1 = values.pop();
            char op = operators.pop();
            values.push(applyOp(val1, val2, op));
        }

        return values.pop();
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    public static int applyOp(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b; // assumes b != 0
        }
        return 0;
    }
}
