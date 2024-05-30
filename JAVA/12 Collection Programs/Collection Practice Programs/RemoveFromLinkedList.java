import java.util.LinkedList;
import java.util.Scanner;

//Write a Java program to remove a specified element from a linked list.
public class RemoveFromLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("shubham");
        linkedList.add("santo");
        linkedList.add("ullu");
        linkedList.add("rakesh");
        linkedList.add("komal");
        linkedList.add("pooja");

        System.out.println("The LinkedList elements are : ");
        System.out.println(linkedList);
        System.out.println("Elements after removing specific element are : ");
        linkedList.remove("ullu");
        System.out.println(linkedList);


    }
}
