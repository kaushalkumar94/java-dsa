import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        // add elements ;
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        // get elments; same as arrays we have indexes here starting from 0 ; '
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        
        // add element in bewtween or any specific index ;
        list.add(1,40);
        System.out.println(list);

        // set element
        list.set(0,80);
        System.out.println(list);

        // delete element 
        list.remove(3);
        System.out.println(list);

        // size 
        System.out.println(list.size());

        // using loops 
        for(int i=0 ; i<list.size(); i++){
            System.out.println(list.get(i));

        }

        // sorting
        Collections.sort(list);
        System.out.println(list);



    }
    
}
