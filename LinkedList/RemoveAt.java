import java.util.*;

public class RemoveAt {
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
        public int getFirst(){
            if (size==0){
                System.out.println("ll empty ");
                return -1;
            }else{
                return head.data;
            }
        }
        public int GetLast(){
            if (size==0){
                System.err.println("ll empty ");
                return -1;
            }else{
                return tail.data;
            }
        }
        public int GetAtd(int idx){
            if (size==0){
                System.err.println("ll empty ");
                return -1;
            }else{
                node temp=head;
                for (int i =0;i<idx;i++){
                    temp=temp.next;
                }
                return temp.data;
            }
        }
        public void addFirst(int val ){
            node temp = new node();
            temp.data= val ;
            temp.next= head;
            head = temp;
            if(size==0){
                tail= temp;
            }
            size++;
        }
        public void addat(int val, int idx){
            if (idx<0||idx>size){
                System.out.println("invalid index");
            }else if(idx==0){
                addFirst(val);
            }else if(idx==size){
                addLast(val);
            }else{
                node nde = new node();
                nde.data= val ;
                node temp= head;
                for (int i=0; i<idx-1;i++){
                    temp= temp.next;
                }
                nde.next=temp.next;
                temp.next=nde;
                size++;

                
            }
        }
        public void removeLast(){
            if (size==0){
                System.out.println("impossible can't do ");
            }else if(size==1){
                head = tail = null;
                size=0;
            }else{
                node temp = head ;
                for(int i =0; i<size-2;i++){
                    temp=temp.next;
                }
                tail=temp;
                temp.next=null;
                size--;
            }
        }
        public void removeat(int idx){
            if(idx==0){
                removeFirst();
            }else if(idx==size){
                removeLast();
            }else if (idx<0||idx>size){
                System.out.println("invalid index");
            }else{
                node temp = head ;
                for(int i=0;i<idx-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
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
        list.addFirst(99);
        list.addat(89,4);
        list.addat(77,7);
        list.addat(380, 0);
        list.display();
        // list.removeLast();
        list.removeat(3);
        
        // System.out.println(list.getFirst());
        // System.out.println(list.GetLast());
        // System.out.println(list.GetAtd(3));
        list.display();
        

      
    }
}