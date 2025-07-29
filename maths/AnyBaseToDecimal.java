import java.util.*;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int rv = changetoDecimal(n, b);
        System.out.println(rv);
    }

    public static int changetoDecimal(int n, int b) {
        int rem = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            rem += dig * p;
            p = p * b;

        }

        return rem;

    }
}
