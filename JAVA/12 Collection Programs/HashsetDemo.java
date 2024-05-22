//program to demonstrate Hashset
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo {
    public static void main(String[] args) {
        Set  set=new HashSet<>();// creating new HashSet
        set.add(10);//adding elements to Hashset
        set.add(70);
        set.add(30);
        set.add(15);
        set.add(20);
        set.add(40);
        System.out.println(set);
        Iterator iterator=set.iterator(); // iterating through HashSet using Iterator
                while(iterator.hasNext())
                {
                    System.out.println(iterator.next());
                }


    }
}
