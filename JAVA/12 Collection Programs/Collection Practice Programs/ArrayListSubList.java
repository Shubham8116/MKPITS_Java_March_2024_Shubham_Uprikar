import java.util.ArrayList;
import java.util.List;

//Write a Java program to extract a portion of an array list.
public class ArrayListSubList {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println("The amin arraylist elements : ");
        System.out.println(arrayList);
        List list=arrayList.subList(0,4);
        System.out.println("The sublis of arrayList is: ");
        System.out.println(list);

    }
}
