public class arrays {
    public static void main (String[] var0){
        int [] arr ;
        arr = new int[7];
        arr[0]=23;
        arr[2]=99;
        arr[1]=32; 
        arr[3]=45;
        arr[4]=98;
        arr[5]=27;
        arr[6]=21;

        // System.out.println(arr.length);
        // for (int i =0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        int [] two = arr;
        two[2]=893;
        for(int i =0; i<two.length; i++){
            System.out.println(two[i]);
        }
    }
    
}
