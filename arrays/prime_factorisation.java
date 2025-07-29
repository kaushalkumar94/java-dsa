import java.util.Scanner;
public class prime_factorisation {
    public static void main(String[] var0){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int div=2; div*div<= n; div++){//prime property to save time less then sqr root /
            while(n%div==0){
            n=n/div;
            System.out.print(div+ " ");
        }
        }
         if (n!=1){
            System.out.println(n);
    }
    }
   
    
}
