import java.util.HashSet;

//Write a Java program to remove all elements from a hash set.
public class HashSetRemoveAll {
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
        System.out.println("HashSet after removing all elements is : ");
        hashSet.clear();
        System.out.println(hashSet);
    }
}
