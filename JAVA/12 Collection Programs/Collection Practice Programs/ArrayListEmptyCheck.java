import java.util.ArrayList;

//Write a Java program to test whether an array list is empty or not.
public class ArrayListEmptyCheck {
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
        System.out.println(arrayList.isEmpty());//checking for ArrayList is empty or not

    }

}
