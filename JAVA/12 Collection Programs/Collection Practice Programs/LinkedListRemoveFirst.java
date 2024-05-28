import java.util.LinkedList;

//Write a Java program to remove and return the first element of a linked list.
public class LinkedListRemoveFirst {
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
        System.out.println("removed and returned first element of a linked list");
        System.out.println(linkedList.remove());
    }
}
