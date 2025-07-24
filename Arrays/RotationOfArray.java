import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class RotationOfArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());

        }
        int k = Integer.parseInt(br.readLine());
        rotate(a, k);
        display(a);

    }

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);

    }

    public static void reverse(int[] a, int i, int j) {
        int li = i;
        int ri = j;
        while (li < ri) {
            int tem = a[li];
            a[li] = a[ri];
            a[ri] = tem;
            li++;
            ri--;
        }
    }

    public static void rotate(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        // reverseign p1//
        reverse(a, 0, a.length - k - 1);
        // reversing p2 //
        reverse(a, a.length - k, a.length - k - 1);
        // reversing the whole array now //
        reverse(a, 0, a.length - 1);

    }

}
