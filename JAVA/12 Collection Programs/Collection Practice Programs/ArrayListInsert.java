import java.util.ArrayList;

// Write a Java program to insert an element into the array list at the first position.
public class ArrayListInsert {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        System.out.println("Items in the ArrayList are : ");
        System.out.println(arrayList);
        //adding element in the first position
        arrayList.add(0,"Black");
        System.out.println(arrayList);
    }
}
