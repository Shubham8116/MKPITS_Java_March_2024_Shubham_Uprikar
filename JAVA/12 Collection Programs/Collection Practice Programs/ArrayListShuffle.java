import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to shuffle elements in an array list.
public class ArrayListShuffle {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println("The colors are before shuffle : ");
        System.out.println(arrayList);
        System.out.println("The colors after shuffle : ");
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

    }
}
