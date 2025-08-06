 import java.util.*;
public class swapgame1 {
    
        public static class Person {
        int age;
        String name;

        void sayHi() {
            System.out.println(name + "[" + age + "] sayshii");
        }

    }

    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.age=33;
        p.name="karan";
        // p.sayHi();

        Person k = new Person();
        k.name="kaushal";
        k.age=21;
        // k.sayHi();

        p.sayHi();
        k.sayHi();
        swap1(p,k);
        p.sayHi();
        k.sayHi();
    }
    public static void swap1(Person p1, Person p2){
        Person temp = p1;
        p1=p2;
        p2=temp;
    }

}
