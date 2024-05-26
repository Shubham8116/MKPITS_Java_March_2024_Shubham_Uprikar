import java.util.HashSet;

//Write a Java program to check for empty an hash set.
public class HashSetEmptyCheck {
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
        System.out.println(hashSet.isEmpty());// will return false
    }
}
