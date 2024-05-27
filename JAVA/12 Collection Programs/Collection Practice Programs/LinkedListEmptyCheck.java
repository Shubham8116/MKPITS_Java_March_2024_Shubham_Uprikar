import java.util.LinkedList;

// Write a Java program to check if a linked list is empty or not.
public class LinkedListEmptyCheck {
    public static void main(String[] args) {
        //creating LinkedList
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
        //checking if linkedlist empty or not
        System.out.println(linkedList.isEmpty());
    }
}
