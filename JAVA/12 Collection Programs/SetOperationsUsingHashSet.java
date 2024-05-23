//program to demonstrate basic Set operations
import java.util.HashSet;
import java.util.Set;

public class SetOperationsUsingHashSet {
    public static void main(String[] args) {
        Set set=new HashSet()
        {{
           add(34);
            add(200);
            add(56);
            add(15);
        }};
        Set set1=new HashSet()
        {{
            add(34);
            add(15);
            add(40);
            add(100);

        }};
        System.out.println("Printing set : "+set);
        System.out.println("printing set 1 : "+set1);
        Set set2=new HashSet();
        set2.addAll(set);
        set2.addAll(set1);
        System.out.println("Union is calculated in set 2 is : "+set2);// will print union of set and set1
        System.out.println("The intersection is : ");
        set.retainAll(set1);// will retain common elements in the set that is intersection of Set
        System.out.println(set);
        System.out.println("Difference of set2 and set1 is : ");
        set2.removeAll(set1);// will calculate difference between set2 and set1 .
        System.out.println(set2);

    }
}
