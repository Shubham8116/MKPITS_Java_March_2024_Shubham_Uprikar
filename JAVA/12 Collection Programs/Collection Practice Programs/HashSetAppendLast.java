import java.util.HashSet;

//Write a Java program to append the specified element to the hash set.
public class HashSetAppendLast {
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
        hashSet.add("china");
        System.out.println("HashSet after appending element");
        System.out.println(hashSet);
    }
}
