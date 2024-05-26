// Write a Java program to update an array element by the given element.
import java.util.ArrayList;

public class ArrayListUpdate {
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
        //updating yellow color to white
        System.out.println("updating yellow color to white");
        arrayList.set(1,"White");
        System.out.println(arrayList);

}
}
