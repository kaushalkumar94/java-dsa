
// welcome back again kaushal now we make function to reduce the maintainablity and redundancy of the code 
// there is this simple rule in coding world DRY DON'T REPEAT YOURSELF ..
import java.util.Scanner;

public class functtion2 {

    public static int fact(int x) {
        int rv = 1; // rv = return value
        for (int i = 1; i <= x; i++) {
            rv = rv * i;
        }
        return (rv);
    }

    public static void display(int n, int r, int npr) {
        System.out.println(n + "P" + r + "=" + npr);

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int nfact = fact(n);

        int nrfact = fact(r);

        int npr = nfact / nrfact;
        display(n, r, npr);

    }
}
