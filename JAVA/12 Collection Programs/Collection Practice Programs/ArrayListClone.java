//Write a Java program to clone an array list to another array list.
import java.util.ArrayList;

public class ArrayListClone {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println("The arrayList is : ");
        System.out.println(arrayList);
        //creating new ArrayList
        ArrayList arrayList1=new ArrayList(arrayList);
        System.out.println("New ArrayList after cloning with old ArrayList");
        System.out.println(arrayList1);


    }
}
