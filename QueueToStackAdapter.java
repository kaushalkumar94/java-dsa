import java.util.*;

public class QueueToStackAdapter {
    public static class QtSA { // queue to stack adapter POP efficient
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QtSA() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        int size() {
            return mainQ.size();
        }

        void push(int val) {
            while (mainQ.size() > 0) {
                helperQ.add(mainQ.remove());
            }
            mainQ.add(val);
            while (helperQ.size() > 0) {
                mainQ.add(helperQ.remove());
            }
        }

        int pop() {
            if (size() == 0) {
                System.out.println("stack underflow");
                return -1;
            } else {
                return mainQ.remove();
            }
        }

        int top() {
            if (size() == 0) {
                System.out.println("stack underflow");
                return -1;
            } else {
                return mainQ.peek();
            }
        }
    }

    // ✅ main method inside the class
    public static void main(String[] args) {
        QtSA st = new QtSA();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top()); // 30
        System.out.println(st.pop()); // 30
        System.out.println(st.top()); // 20
        System.out.println(st.pop()); // 20
        System.out.println(st.pop()); // 10
        System.out.println(st.pop()); // stack underflow, -1
    }
}
