import java.util.Scanner;

public class printPrime {
    public static void main(String[] var0){
        Scanner scn = new Scanner (System.in);
        System.out.println("enter your lower value :");
        int low = scn.nextInt();
        System.out.println("enter you upper value :");
        int high= scn.nextInt();
        for(int n = low; n<=high; n++){
            int count= 0;
            for(int div = 2; div*div<=n; div++){
                if(n%div==0){
                    count++;
                    break;
                }       
            }
        if (count==0){
            System.out.println(n);
        }
    }
    
}
}