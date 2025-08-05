import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class MergeOverlapinInterval {

    public static class Pair implements Comparable<Pair> {
        int st;
        int et;

        Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }

        public int compareTo(Pair other) {
            return this.st - other.st;
        }
    }

    public static void MergeOverlapinInterval(int[][] arr) {
        Pair[] pairs = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }

        Arrays.sort(pairs);

        Stack<Pair> st = new Stack<>();
        for (int i = 0; i < pairs.length; i++) {
            if (st.isEmpty()) {
                st.push(pairs[i]);
            } else {
                Pair top = st.peek();
                if (pairs[i].st > top.et) {
                    st.push(pairs[i]);
                } else {
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }

        // Print merged intervals
        while (!st.isEmpty()) {
            Pair p = st.pop();
            System.out.println(p.st + " " + p.et);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(parts[0]);
            arr[i][1] = Integer.parseInt(parts[1]);
        }

        MergeOverlapinInterval(arr);
    }
}
