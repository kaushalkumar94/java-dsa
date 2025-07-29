import java.util.*;

public class AnybaseTOAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();     // number in base b1
        int b1 = scn.nextInt();    // source base
        int b2 = scn.nextInt();    // target base

        int result = anyBaseToAnyBase(n, b1, b2);
        System.out.println(result);
    }

    // Converts a number from any base to any base
    public static int anyBaseToAnyBase(int n, int b1, int b2) {
        int decimal = anyBaseToDecimal(n, b1);     // Step 1: Convert to decimal
        return decimalToAnyBase(decimal, b2);      // Step 2: Convert decimal to target base
    }

    // Step 1: Convert number from base b1 to decimal
    public static int anyBaseToDecimal(int n, int base) {
        int result = 0;
        int power = 1;

        while (n > 0) {
            int digit = n % 10;
            result += digit * power;
            power *= base;
            n /= 10;
        }
        return result;
    }

    // Step 2: Convert number from decimal to base b2
    public static int decimalToAnyBase(int n, int base) {
        int result = 0;
        int power = 1;

        while (n > 0) {
            int digit = n % base;
            result += digit * power;
            power *= 10;
            n /= base;
        }
        return result;
    }
}
