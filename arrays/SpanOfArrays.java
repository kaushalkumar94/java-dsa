import java.util.Scanner;

public class SpanOfArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        // Input values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Find max
        int max = arr[0];
        for (int j = 1; j < n; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }

        // Find min
        int min = arr[0];
        for (int k = 1; k < n; k++) {
            if (arr[k] < min) {
                min = arr[k];
            }
        }

        int span = max - min;
        System.out.println("Span of array: " + span);
    }
}
