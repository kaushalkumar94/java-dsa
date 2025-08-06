
import java.util.*;

public class first {
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
        p.sayHi();

        Person k = new Person();
        k.name="kaushal";
        k.age=21;
        k.sayHi();

    }

}
