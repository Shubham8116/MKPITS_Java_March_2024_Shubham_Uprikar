import java.util.ArrayList;

//Write a Java program to empty an array list.
public class ArrayListEmpty {
    public static void main(String[] args) {
        //Creating ArrayList
        ArrayList arrayList=new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println("The ArrayList is : ");
        System.out.println(arrayList);
        arrayList.clear();// will clear the ArrayList
        System.out.println("ArrayList after empty");
        System.out.println(arrayList);
    }
}
