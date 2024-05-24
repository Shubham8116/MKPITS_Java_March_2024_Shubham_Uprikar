import java.util.ArrayList;

// Write a Java program to replace the second element of an ArrayList with the specified element.
public class ArrayListElementReplace {
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
        arrayList.set(1,"Hello");
        System.out.println("ArrayList after replacing 2nd element is : ");
        System.out.println(arrayList);

    }
}
