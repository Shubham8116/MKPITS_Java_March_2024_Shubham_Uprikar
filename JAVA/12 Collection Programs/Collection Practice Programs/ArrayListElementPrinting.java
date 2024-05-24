import java.util.ArrayList;

//Write a Java program to print all the elements of an ArrayList using the elements' position.
public class ArrayListElementPrinting {
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
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Index "+ i+" element is : "+arrayList.get(i));

        }

    }


}
