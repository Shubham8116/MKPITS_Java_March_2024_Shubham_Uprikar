import java.util.ArrayList;

//Write a Java program to remove the third element from an array list.
public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println("The colors are : ");
        System.out.println(arrayList);
        //removing 3rd element from the List
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
