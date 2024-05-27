import java.util.HashSet;
import java.util.TreeSet;

//Write a Java program to convert a hash set to a tree set.
public class HashsetToTreeSet {
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
        TreeSet  treeSet=new TreeSet(hashSet);//paasing Hashset object to treeset
        System.out.println(treeSet);//printing sorted TreeSet
    }
}
