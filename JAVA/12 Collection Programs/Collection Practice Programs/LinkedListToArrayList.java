import java.util.ArrayList;
import java.util.LinkedList;

//Write a Java program to convert a linked list to an array list.
public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(34);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(100);
        linkedList.add(68);
        linkedList.add(40);
        linkedList.add(26);
        System.out.println("The LinkedList elements are : ");
        System.out.println(linkedList);
        System.out.println("converting LinkedList To an Arraylist");
        ArrayList arrayList=new ArrayList(linkedList);
        System.out.println(arrayList);
    }
}
