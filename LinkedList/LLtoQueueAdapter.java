import java.util.*;

public class LLtoQueueAdapter {
    LinkedList<Integer> list;

    public LLtoQueueAdapter() {
        list = new LinkedList<>();
    }

    int size() {
        return list.size();
    }

    void add(int val) {
        list.addLast(val);  // enqueue
    }

    int remove() {
        if (list.size() == 0) {
            System.out.println("Queue underflow");
            return -1;
        }
        return list.removeFirst(); // dequeue
    }

    int peek() {
        if (list.size() == 0) {
            System.out.println("Queue underflow");
            return -1;
        }
        return list.getFirst(); // front element
    }

    public static void main(String[] args) {
        LLtoQueueAdapter q = new LLtoQueueAdapter();

        // Add elements
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Size: " + q.size());  // 3
        System.out.println("Front: " + q.peek()); // 10

        // Remove elements
        System.out.println("Removed: " + q.remove()); // 10
        System.out.println("Front after remove: " + q.peek()); // 20

        q.add(40);
        System.out.println("Front: " + q.peek()); // 20
        System.out.println("Size: " + q.size());  // 3
    }
}
