import java.util.*;

public class AddData_at_last {
    public static class node {
        int data;
        node next;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        void addLast(int val) {
            node temp = new node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;

        }
    }

    public static void testList(LinkedList list) {
        for (node temp = list.head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }
        System.out.println(list.size);
        if (list.size > 0) {
            System.out.println(list.tail.data);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        testList(list);
    }
}