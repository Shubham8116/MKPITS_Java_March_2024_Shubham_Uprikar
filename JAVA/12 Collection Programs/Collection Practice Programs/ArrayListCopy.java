import java.util.ArrayList;

// Write a Java program to copy one array list into another
public class ArrayListCopy {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println("ArrayList 1 : ");
        System.out.println(arrayList);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add(4);
        arrayList1.add(10);
        arrayList1.add(100);
        arrayList1.add(4000);
        System.out.println("ArrayList 2 : ");
        System.out.println(arrayList1);
        //copying 2nd ArrayList into 1st ArrayList
        System.out.println("after copying 2nd ArrayList into 1st ArrayList : ");
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);


    }
}
