import java.util.Scanner;
public class find_element_in_array {
    public static void main (String[] var0){
        Scanner scn = new Scanner(System.in );
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ; i <arr.length; i++){

            arr[i]= scn.nextInt();

        }
        int check = scn.nextInt();
        int index =-1;
        for (int i =0; i<n; i++){
            if (arr[i]==check){
                index=i;
                break;
                
            }
         
        }
        System.out.println(index);

    }
}
