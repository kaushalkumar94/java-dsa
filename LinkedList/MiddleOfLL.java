    public class MiddleOfLL {
    
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
            
            public int PrintMiddle () {
                Node fast = head;
                Node slow = head;

                // Move fast pointer 2 steps ahead of slow 
            

                // Move slow with one step adn fast with 2 steps until fast reaches the end(fast.next=null)
                while (fast.next != null&& fast.next.next!=null) { // for both odd && even cases 
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return slow.data;
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

            System.out.println(list.PrintMiddle());
            
        }
    }
