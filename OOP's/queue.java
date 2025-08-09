import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> que= new ArrayDeque<>();

        que.add(12);
        // System.err.println(que.add(12));// this will chechk true or false 
        System.out.println(que);
        que.add(13);
        System.out.println(que);
        // System.err.println(que.add(13));
        que.add(14);
        System.out.println(que);
        // System.err.println(que.add(14));

        System.out.println(que.peek());
        System.out.println(que);
        
        System.out.println(que.remove(que));
        System.out.println(que);


    }
    
}
