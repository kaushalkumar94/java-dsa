import java.util.*;

public class LLtoStackAdapter {
    LinkedList<Integer> list;

 
    public LLtoStackAdapter() {
        list = new LinkedList<>();
    }

    void push(int val) {
        list.addFirst(val);
    }

    int size() {
        return list.size();
    }

    int pop() {
        if (list.size() == 0) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return list.removeFirst();
        }
    }

    int top() {
        if (list.size() == 0) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return list.getFirst();
        }
    }

    public static void main(String[] args) throws Exception {
        LLtoStackAdapter st = new LLtoStackAdapter();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top: " + st.top());   // 30
        System.out.println("Pop: " + st.pop());   // 30
        System.out.println("Pop: " + st.pop());   // 20
        System.out.println("Size: " + st.size()); // 1
        System.out.println(st.list);
    }
}
