// Write a Java program that swaps two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListElementSwap {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println("The ArrayList is : ");
        System.out.println(arrayList);
        System.out.println("ArrayList after swaping element 2 with 3 is : ");
        Collections.swap(arrayList,1,2);
        System.out.println(arrayList);
    }
}