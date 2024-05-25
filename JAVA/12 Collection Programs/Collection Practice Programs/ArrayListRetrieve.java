import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given array list.
public class ArrayListRetrieve {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println("The colors are : ");
        System.out.println(arrayList);
        //accessing 2nd element from the List
        System.out.println("Accessing 2nd element : " + arrayList.get(1));
    }
}