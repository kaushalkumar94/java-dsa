import java.util.Scanner;
public class pattern1 {
    public static void main(String[]var0){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println(" ");
        }
    }
    
}
///here we learn about abstraction which means for on one thing layer by layer //