import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to sort a given array list.
public class ArrayListSort {
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
        System.out.println("ArrayList after sorting");
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }

}
