import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in an array list.
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        Iterator iterator=arrayList.iterator();
        System.out.println("The colors are : ");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
}