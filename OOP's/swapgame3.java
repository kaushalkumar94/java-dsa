 

public class swapgame3 {
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
       Person ps1= new Person();
       int tempage = p1.age;
       p1.age=p2.age;
       p2.age=tempage;
       
       Person ps2 = new Person();
       String tempname =p1.name;
       p1.name= p2.name;
       p2.name= tempname;
    }
    
}
