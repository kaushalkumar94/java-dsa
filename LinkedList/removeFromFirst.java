import java.util.*;

public class removeFromFirst {
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
        public int size(){
            return size;
        }
        public void display(){
            node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }System.out.println();
        }
        public void removeFirst(){
            if (size==0){
                System.out.println("LL is empty ");
            }else if(size==1){
                head= tail=null;
                size--;
            }else{
                head = head.next;
                size--;
            }
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
        list.addLast(40);
        list.addLast(50);
        
        
        System.out.println("Size: " + list.size());

        list.display();
        list.removeFirst();
        list.display();
        System.out.print("Size:" + list.size());

      
    }
}