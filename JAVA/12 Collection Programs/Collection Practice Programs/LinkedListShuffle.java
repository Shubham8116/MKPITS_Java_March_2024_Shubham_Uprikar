import java.util.Collections;
import java.util.LinkedList;

//Write a Java program to shuffle elements in a linked list.
public class LinkedListShuffle {
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
        System.out.println("elements after shuffle are : ");
        Collections.shuffle(linkedList);
        System.out.println(linkedList);
    }
}
