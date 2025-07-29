import java.util.*;
public class changeDecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in );
        int n =sn .nextInt();
        int b= sn .nextInt();
        int dn = changeTObase(n,b);
        System.out.println(dn);
        
    }
    public static int changeTObase(int n, int b){
        int rv=0;
        int p=1;
        if(b==8){
            while(n>0){
                int dig =n%b;
                n=n/b;
                rv+=dig*p;
                p=p*10;
            }
             
        }
        if(b==2){
            while(n>0){
                int dig1=n%2;
                n=n/2;
                rv+=dig1*p;
                p=p*10;
            }
             
        }
        return rv;
    }
}
