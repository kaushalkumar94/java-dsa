 public class constructor {
                    public static class Person {
        int age;
        String name;

        void sayHi() {
            System.out.println(name + "[" + age + "] sayshii");
        }
        Person(){
        //by default Person constructor is defined here if we forget java compiler does it for us 
        }
        // parameterized constructor 
        // we can define ourself 
        Person(int age , String name ){
            this.age= age;
            this.name = name ;
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
        Person m = new Person(12,"soshu");

        p.sayHi();
        k.sayHi();
        m.sayHi();
    
}

 }