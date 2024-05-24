import java.util.ArrayList;

public class ArrayListCompare {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Red");
        arrayList.add("Yellow");

        arrayList.add("Pink");

        arrayList.add("Blue");

        arrayList.add("Grey");

        arrayList.add("Black");
        System.out.println("The 1st ArrayList : ");
        System.out.println(arrayList);
        //creating second ArrayList
        ArrayList arrayList1 = new ArrayList();


        arrayList1.add("Pink");

        arrayList1.add("Blue");

        arrayList1.add("Grey");

        arrayList1.add("Black");
        System.out.println("The 2nd ArrayList : ");
        System.out.println(arrayList1);
        System.out.println(arrayList.equals(arrayList1));//will show flase

    }
}