import java . util.Scanner;
public class digitFreq {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f= GetdigitFreq(n,d);
        System.out.println(f);
    }
    public static int  GetdigitFreq (int n,int d){
        int count=0;
        while (n>0) {
            int dig = n%10;
            n=n/10;
            if(dig==d){
                count++;
            }
            
        }
        return(count);
    }

    
}
