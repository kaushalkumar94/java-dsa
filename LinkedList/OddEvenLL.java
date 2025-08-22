import java.util.*;

public class OddEvenLL {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static class LinkedList {
        Node head, tail;
        int size;

        void addLast(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        int getFirst() {
            if (head == null) throw new NoSuchElementException();
            return head.data;
        }

        void removeFirst() {
            if (head == null) throw new NoSuchElementException();
            head = head.next;
            size--;
            if (size == 0) tail = null;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void oddeven(LinkedList list) {
        LinkedList odd = new LinkedList();
        LinkedList even = new LinkedList();

        while (list.size > 0) {
            int val = list.getFirst();
            list.removeFirst();
            if (val % 2 == 0) {
                even.addLast(val);
            } else {
                odd.addLast(val);
            }
        }

        // merge odd and even lists
        if (odd.size > 0 && even.size > 0) {
            odd.tail.next = even.head;
            list.head = odd.head;
            list.tail = even.tail;
            list.size = odd.size + even.size;
        } else if (odd.size > 0) {
            list.head = odd.head;
            list.tail = odd.tail;
            list.size = odd.size;
        } else if (even.size > 0) {
            list.head = even.head;
            list.tail = even.tail;
            list.size = even.size;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println("Original List:");
        list.display();

        oddeven(list);

        System.out.println("After Odd-Even (value-based):");
        list.display();
    }
}
