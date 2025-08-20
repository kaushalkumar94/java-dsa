import java.io.*;
import java.util.*;

public class MergeSortLL {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // LinkedList class
    static class LinkedList {
        Node head;

        // Add element at the end
        public void addLast(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Display linked list
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Function to merge two sorted lists
    public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
        Node one = l1.head;
        Node two = l2.head;
        LinkedList res = new LinkedList();

        while (one != null && two != null) {
            if (one.data < two.data) {
                res.addLast(one.data);
                one = one.next;
            } else {
                res.addLast(two.data);
                two = two.next;
            }
        }

        while (one != null) {
            res.addLast(one.data);
            one = one.next;
        }

        while (two != null) {
            res.addLast(two.data);
            two = two.next;
        }

        return res;
    }

    // Find mid node (for merge sort)
    public static Node midnode(Node head, Node tail) {
        Node f = head;
        Node s = head;
        while (f != tail && f.next != tail) {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }

    // Merge Sort for LinkedList
    public static LinkedList mergeSort(Node head, Node tail) {
        if (head == tail) {
            LinkedList br = new LinkedList();
            br.addLast(head.data);
            return br;
        }

        Node mid = midnode(head, tail);
        LinkedList fsh = mergeSort(head, mid);
        LinkedList ssh = mergeSort(mid.next, tail);

        return mergeTwoSortedLists(fsh, ssh);
    }

    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input size
        int n = Integer.parseInt(br.readLine());
        LinkedList l = new LinkedList();

        // Input elements
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int d = Integer.parseInt(values[i]);
            l.addLast(d);
        }

        // Run merge sort
        LinkedList sorted = mergeSort(l.head, getTail(l.head));
        sorted.display();
    }

    // Utility to get tail node
    public static Node getTail(Node head) {
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }
}
