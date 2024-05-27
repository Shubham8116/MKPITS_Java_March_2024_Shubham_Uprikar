import java.util.HashSet;

// Write a Java program to convert a hash set to an array.
public class HashSetToArray {
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
        System.out.println(hashSet);
        Object o[]= hashSet.toArray();//converting HashSet to array
        for(Object a:o)
        {
            System.out.println(a);
        }
    }
}
