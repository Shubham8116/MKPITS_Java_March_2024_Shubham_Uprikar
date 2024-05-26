import java.util.ArrayList;

//Write a Java program to increase an array list size.
public class ArrayListSizeIncrease {
    public static void main(String[] args) {
        //Creating ArrayList
        ArrayList arrayList=new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println(arrayList);
        arrayList.ensureCapacity(40); // capacity increased


    }
}
