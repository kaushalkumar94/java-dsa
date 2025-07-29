import java.util.Scanner;
public class LengthOfDigit {
    public static void main(String[] var0){
        System.out.println("enter the digit :");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dig =0;
        while (n!=0){
            n=n/10;
            dig++;
        }
        System.out.println(dig);
    }
    
}
