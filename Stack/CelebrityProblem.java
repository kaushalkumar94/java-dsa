import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CelebrityProblem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            String line = br.readLine();
            for (int k = 0; k < arr.length; k++) {
                arr[i][k] = line.charAt(k) - '0';
            }
        }
        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }

        while (st.size() >= 2) {
            int i = st.pop();
            int j = st.pop();
            if (arr[i][j] == 1) {
                // i knows j means i is not the celebrity
                st.push(j);

            } else {
                // i dosen't know j means j is not the celebrity
                st.push(i);
            }
        }

        // now we will check wheter pot is not celebrity or is ?
        int pot = st.pop(); // pot means potential
        for (int i = 0; i < arr.length; i++) {
            if (i != pot) {
                if (arr[i][pot] == 0 || arr[pot][i] == 1) {
                    System.out.println("none");
                    return;

                }
            }
        }
        System.out.println(pot);// means the potential was the actual celebrity confirmed
    }

}
