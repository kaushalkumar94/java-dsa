import java.util.*;

public class AnyBaseMulti {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int b = sn.nextInt();
        int n1 = sn.nextInt();
        int n2 = sn.nextInt();
        int rv = getmulti(b, n1, n2);
        System.out.println(rv);
    }

    public static int getmulti(int b, int n1, int n2) {
        int rv = 0;
        int p = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int sprd = singledigitproduct(b, n1, d2);
            rv = additon(b, rv, sprd * p);
            p = p * 10;
        }
        return rv;
    }

    public static int singledigitproduct(int b, int n1, int d2) {
        int rv = 0;
        int p = 1;
        int c = 0;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d = d1 * d2 + c;
            c = d / b;
            d = d % b;
            rv = rv + d * p;
            p = p * 10;

        }
        return rv;

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
