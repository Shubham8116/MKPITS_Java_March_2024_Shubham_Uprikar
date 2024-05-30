import java.util.Collections;
import java.util.LinkedList;

// Write a Java program that swaps two elements in a linked list.
public class LinkedListSwapElements {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(34);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(100);
        linkedList.add(68);
        linkedList.add(40);
        linkedList.add(26);
        System.out.println("The LinkedList elements are : ");
        System.out.println(linkedList);
        System.out.println("LinkedList after swapping element 2 with 3 is : ");
        Collections.swap(linkedList,1,2);
        System.out.println(linkedList);
    }
}
