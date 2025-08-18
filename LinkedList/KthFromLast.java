public class KthFromLast {

    // make it static so it can be used in main
    public static class LinkedList {
        static class Node {
            int data;
            Node next;
            Node(int d) {
                data = d;
                next = null;
            }
        }

        Node head;

        void PrintKthFromEnd(int k) {
            Node fast = head;
            Node slow = head;

            // Move fast pointer k steps ahead
            for (int i = 0; i < k; i++) {
                if (fast == null) {
                    System.out.println("List has fewer than " + k + " nodes.");
                    return;
                }
                fast = fast.next;
            }

            // Move both until fast reaches the end
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

            System.out.println(k + "th node from end is: " + slow.data);
        }

        void add(int data) {
            Node node = new Node(data);
            if (head == null) {
                head = node;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.PrintKthFromEnd(2);  // should print 40
        list.PrintKthFromEnd(5);  // should print 10
        list.PrintKthFromEnd(6);  // should handle gracefully
    }
}
