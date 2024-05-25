//Write a Java program to join two array lists.
import java.util.ArrayList;


public class ArrayListJoin {
    public static void main(String[] args) {
        //creating ArrayList 1
        ArrayList arrayList=new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println("The ArrayList 1 is : ");
        System.out.println(arrayList);
        //creating ArrayList 2
        ArrayList arrayList1=new ArrayList();
        arrayList1.add("1");
        arrayList1.add("4");
        arrayList1.add("8");
        arrayList1.add("2");
        arrayList1.add("6");
        arrayList1.add("10");
        System.out.println("The ArrayList 2 is : ");
        System.out.println(arrayList1);
        System.out.println("After adding ArrayList 2 with 1 : ");
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);


    }
}
