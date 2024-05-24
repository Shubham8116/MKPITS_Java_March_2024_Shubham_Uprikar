import java.util.ArrayList;

// Write a Java program for trimming the capacity of an array list.
public class ArrayListCapacityTrimming {
    public static void main(String[] args) {
        //Creating ArrayList
        ArrayList arrayList=new ArrayList(20);//providing initial capacity
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println("The ArrayList is : ");
        System.out.println(arrayList);

        arrayList.trimToSize();// trimming cpacity to the size of the ArrayList.

    }
}
