import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class StockSpan {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = Integer.parseInt(bf.readLine());
        }

        int[] span = solve(a);
        display(span);
    }

    public static int[] solve(int[] arr) {
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            // - a +
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
                if (st.size() == 0) {
                    span[i] = i + 1;
                } else {
                    span[i] = i - st.peek();
                }
                st.push(i);

            }

        }
        return span;

    }

}
