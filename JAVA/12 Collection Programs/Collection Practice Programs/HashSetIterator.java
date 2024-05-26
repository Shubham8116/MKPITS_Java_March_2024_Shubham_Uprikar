import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to iterate through all elements in a hash list.
public class HashSetIterator {
    public static void main(String[] args) {
        //Creating HashSet
        HashSet hashSet=new HashSet();
        hashSet.add("America");
        hashSet.add("India");
        hashSet.add("Europe");
        hashSet.add("Australia");
        hashSet.add("Brazil");
        hashSet.add("Russia");
        hashSet.add("UAE");
        hashSet.add("Africa");
        System.out.println("Elements of HashSet are : ");
        // creating Iterator for HashSet
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());//printing elements of hashset using next() method
        }
    }
}
