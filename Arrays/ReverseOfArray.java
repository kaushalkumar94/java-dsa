import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = Integer.parseInt(br.readLine());

        }
         reverse(a);
         display(a);
    }

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (j > i) {
            int tem = a[i];
            a[i] = a[j];
            a[j] = tem;
            i++;
            j--;

        }
    }
}
