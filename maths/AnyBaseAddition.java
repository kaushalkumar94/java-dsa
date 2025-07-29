import java.util.*;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int b = sn.nextInt();
        int n1 = sn.nextInt();
        int n2 = sn.nextInt();
        int rv = additon(b, n1, n2);
        System.out.println(rv);
    }

    public static int additon(int b, int n1, int n2) {
        int rv = 0;
        int p = 1;
        int c = 0;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;
            rv += d * p;
            p = p * 10;
        }

        return rv;
    }
}
