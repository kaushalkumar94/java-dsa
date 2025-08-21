import java.util.*;

class LinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head, tail;
    int size;

    // Remove duplicates from a sorted linked list
    public void removeDuplicates() {
        if (head == null) return;

        Node curr = head;
        while (curr.next != null) {
            if (curr.data == curr.next.data) {
                // delete next node
                curr.next = curr.next.next;
                size--;
            } else {
                // move pointer
                curr = curr.next;
            }
        }
        tail = curr;
    }

    // Utility functions
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class removeDuplicate {   // <-- Match file name
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(4);

        System.out.print("Before: ");
        list.printList();

        list.removeDuplicates();

        System.out.print("After:  ");
        list.printList();
    }
}
