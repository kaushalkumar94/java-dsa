import java.util.*;

public class minimumStack {
    public static class MinStack {
        Stack<Integer> alldata;
        Stack<Integer> mindata;

        public MinStack() {
            alldata = new Stack<>();
            mindata = new Stack<>();
        }

        int size() {
            return alldata.size();
        }

        void push(int val) {
            alldata.push(val);
            if (mindata.isEmpty() || val <= mindata.peek()) {
                mindata.push(val);
            }
        }

        int min() {
            if (size() == 0) {
                System.out.println("underflow");
                return -1;
            } else {
                return mindata.peek();
            }
        }

        int top() {
            if (size() == 0) {
                System.out.println("underflow");
                return -1;
            } else {
                return alldata.peek();
            }
        }

        int pop() {
            if (size() == 0) {
                System.out.println("underflow");
                return -1;
            } else {
                int val = alldata.pop();
                if (val == mindata.peek()) {
                    mindata.pop();
                }
                return val;
            }
        }
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(5);
        st.push(3);
        st.push(7);
        st.push(3);
        System.out.println("Min: " + st.min()); // 3
        System.out.println("Top: " + st.top()); // 3
        st.pop(); // pop 3
        System.out.println("Min after pop: " + st.min()); // still 3
        st.pop(); // pop 7
        System.out.println("Min after pop: " + st.min()); // still 3
        st.pop(); // pop 3
        System.out.println("Min after pop: " + st.min()); // now 5
    }
}
