import java.util.*;

//program to demonstrate TreeSet in java
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<Integer>(){{
           add(45);
            add(1);
            add(4);
            add(100);
            add(60);
            add(30);
            add(1);
        }};

        System.out.println(set);//printing set elements
        System.out.println(set.first());//printing first element
        System.out.println(set.lower(45));
        Object arr[] = set.toArray();// implementation of toArray() method

        // Iterating and printing the elements of the Array
        for (Object i : set)
        {

              System.out.print(i + " ");
        }



    }
}
