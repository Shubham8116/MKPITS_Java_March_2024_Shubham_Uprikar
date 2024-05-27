import java.util.LinkedList;

//Write a Java program to retrieve, but not remove, the last element of a linked list.
public class LinkedListDisplayLast {
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
        System.out.println("The returned Last element of the linked list is : ");
        System.out.println(linkedList.peekLast());
    }
}

