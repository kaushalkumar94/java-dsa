import java.util.*;
public class number_to_digits {
    public  static void main (String[] var0){
        System.out.println("enter your number:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        
        while(n>0){
            int dig=n%10 ;
            n=n/10;
            System.out.println(dig);
             
        
        }
         
    }
    
}
