
// to understand the use of function we will first see the example below of permutation i.e nPr
import java.util.Scanner;

public class functtion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int nfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }
        int nrfact = 1;
        for (int i = 1; i <= n - r; i++) {
            nrfact *= i;
        }

        int npr = nfact / nrfact;
        System.out.println(n + "P" + r + "=" + npr);
    }

}
// here in this code you see that the factorial part of the code is repeating
// for nfact and nrfact
// so to avoid redundancy of code we use functon so in next code functtion2 we
// will use fucntion to resduce redundancy .