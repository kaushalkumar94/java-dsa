import java.util.Scanner;

public class fibonacci {
    public static void main(String[] var0){
        System.out.println("enter the number till you want the series :");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b= 1;
        for(int i = 0; i<n; i++){
             System.out.println(a);
             int c = a+b;
             a=b;
             b=c;
        }
         
    }
    
}
