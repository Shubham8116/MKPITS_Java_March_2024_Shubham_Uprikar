import java.util.LinkedList;

//Write a Java program to insert the specified element at the specified position in the linked list.
public class LinkedListInsertion {
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
        System.out.println("Elements after inserting 300 on the index 3 are : ");
        linkedList.add(2, 300);
        System.out.println(linkedList);
    }
}
