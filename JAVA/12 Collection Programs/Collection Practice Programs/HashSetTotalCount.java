import java.util.HashSet;

//Write a Java program to get the number of elements in a hash set.
public class HashSetTotalCount {
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
        System.out.println("Total elements in the HashSet are  : ");
        System.out.println(hashSet.size());
    }
}
