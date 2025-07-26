import java.util.*;
public class stacks {
    public static void main(String[] args) throws Exception{
        Stack<Integer> st = new Stack<>();
        st.push(1);
        System.out.println(st + "\t" + st.size());
        st.push(2);
        System.out.println(st + "\t" + st.size());
        st.push(3);
        System.out.println(st + "\t" + st.size());      
        st.push(4);
        System.out.println(st + "\t" + st.size());
        st.peek();
        System.out.println(st + "\t" + st.peek()+st.size());
        st.pop();
        System.out.println(st + "\t" + st.size());
    }
}
