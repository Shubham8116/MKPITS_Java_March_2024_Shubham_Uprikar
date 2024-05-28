import java.util.LinkedList;

//Write a Java program to insert elements into the linked list at the first and last positions.
public class LinkedListInsertionFirstLast {
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
        //Inserting elements in the First and Last position
        linkedList.addFirst(10000);
        linkedList.addLast(20000);
        System.out.println("LinkedList after Inserting elements in the First and Last position");
        System.out.println(linkedList);
    }
}
