import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to reverse elements in an array list.
public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<>();
        arrayList.add(34);
        arrayList.add(100);
        arrayList.add(1);
        arrayList.add(500);
        arrayList.add(24);
        arrayList.add(11);
        arrayList.add(800);
        arrayList.add(60);
        System.out.println("ArrayList before reverse");
        System.out.println(arrayList);
        System.out.println("ArrayList after reverse");
        Collections.reverse(arrayList);
        System.out.println(arrayList);

    }
}
