import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class nextGreatestElementToTheRIght2 {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int val : a) {
            sb.append(val + "\n");
        }// may be i was 2nd choice right ??
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = Integer.parseInt(bf.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr) {
        int nge[]= new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for (int i =0; i<arr.length; i++){
            while (st.size()>0&& arr[i]> arr[st.peek()]) {
                int pos = st.peek();
                nge[pos]=arr[i];
                st.pop();
                
            }
            st.push(i);

        }
        while (st.size()>0) {
            int pos = st.peek();
            nge[pos]=-1;
            st.pop();
            
        }

        
        return nge;

    }

}