import java.util.LinkedList;

//Write a Java program to insert some elements at the specified position into a linked list.
public class LinkedListInsertionAtSpecific {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(34);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(100);
        linkedList.add(68);
        linkedList.add(40);
        linkedList.add(26);
        System.out.println("The LinkedList elements before insertion are : ");
        System.out.println(linkedList);
        linkedList.add(4,78);
        System.out.println("Elements after adding 78 at the location 5 are  : ");
        System.out.println(linkedList);
    }
}
