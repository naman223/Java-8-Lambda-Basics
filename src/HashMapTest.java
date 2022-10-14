import io.javabrains.common.Person;
import io.javabrains.common.Test;

import java.util.HashMap;

public class HashMapTest {


    public static void main(String[] a) {

        HashMap<Person, Person> personHashMap = new HashMap();

        Person person1 = new Person("Naman1","Mehta1",40);
        Person person2 = new Person("Naman1","Mehta1",40);
        Person person3 = new Person("Naman1","Mehta1",40);

        System.out.println(person1.equals(person2));

        System.out.println(person1==person2);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        Test t1 = new Test(1);
        Test t2 = new Test(1);

        System.out.println(t1.equals(t2));
        System.out.println(t1==t2);


        personHashMap.put(person1,person1);
        personHashMap.put(person2,person2);
        personHashMap.put(null,person3);

        System.out.println(personHashMap.size());
        System.out.println(personHashMap.get(null));

        String s = null;

        System.out.println(s==null);
        // System.out.println(s.equals(null)); - nullpointer
        System.out.println(null==s);


    }

}
