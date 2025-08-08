import java.io.*;
import java.util.*;

public class MinimumStackConstantSpace {

    public static class MinStack {
        Stack<Integer> stk;
        int min;

        public MinStack() {
            stk = new Stack<>();
            min = Integer.MAX_VALUE;
        }

        int size() {
            return stk.size();
        }

        void push(int val) {
            if (stk.isEmpty()) {
                stk.push(val);
                min = val;
            } else if (val >= min) {
                stk.push(val);
            } else {
                int encodedVal = 2 * val - min;
                stk.push(encodedVal);
                min = val;
            }
        }

        int pop() {
            if (stk.isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }

            int top = stk.pop();
            if (top >= min) {
                return top;
            } else {
                int actualVal = min;
                min = 2 * min - top;
                return actualVal;
            }
        }

        int top() {
            if (stk.isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }

            int top = stk.peek();
            return (top >= min) ? top : min;
        }

        int getMin() {
            if (stk.isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            return min;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MinStack st = new MinStack();

        String str = br.readLine();
        while (!str.equals("quit")) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            } else if (str.startsWith("min")) {
                int val = st.getMin();
                if (val != -1) {
                    System.out.println(val);
                }
            }
            str = br.readLine();
        }
    }
}
