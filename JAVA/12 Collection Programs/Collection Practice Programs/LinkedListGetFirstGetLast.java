import java.util.LinkedList;

//Write a Java program to get the first and last occurrence of the specified elements in a linked list.
public class LinkedListGetFirstGetLast {
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
        System.out.println("The first element is : "+linkedList.getFirst());
        System.out.println("The Last element is : "+linkedList.getLast());
    }
}
