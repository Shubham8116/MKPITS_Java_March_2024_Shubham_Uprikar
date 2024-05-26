import java.util.HashSet;

//Write a Java program to clone a hash set to another hash set.
public class HashSetClone {
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
        //Creating new HashSet and copying another HashSet to it
        HashSet newHashSet =new HashSet(hashSet);
        System.out.println("Elements after cloning are : ");
        System.out.println(newHashSet);
    }
}
