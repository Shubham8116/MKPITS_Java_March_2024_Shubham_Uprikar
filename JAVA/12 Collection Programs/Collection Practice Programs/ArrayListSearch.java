import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//Write a Java program to search for an element in an array list.
public class ArrayListSearch {

    public static void main(String[] args) {
        int count=0;
        ArrayList arrayList = new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println("The colors are : ");
        System.out.println(arrayList);
        System.out.println("Enter element name to search");
        Scanner scanner=new Scanner(System.in);
        String search=scanner.next();
        Iterator  iterator= arrayList.iterator();
        while (iterator.hasNext())
        {
            if (iterator.next().toString().equalsIgnoreCase(search)) {
                System.out.println("Element is found");
                count++;
                return;
            }


        }
        if (count==0)
            System.out.println("Element is not found");
    }
}
