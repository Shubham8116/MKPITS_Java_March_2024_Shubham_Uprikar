import java.util.LinkedList;

// Write a Java program to remove all elements from a linked list.
public class LinkedListRemoveAll {
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
        linkedList.clear();//it will remove all elements

        System.out.println("LinkedList after removing all elements is : ");
        System.out.println(linkedList);
    }
}
