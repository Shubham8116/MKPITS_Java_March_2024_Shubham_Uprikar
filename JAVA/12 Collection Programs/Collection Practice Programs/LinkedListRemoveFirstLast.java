import java.util.LinkedList;

//Write a Java program to remove the first and last elements from a linked list.
public class LinkedListRemoveFirstLast {
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
        linkedList.removeFirst();//it will remove first element
        linkedList.removeLast();//it will remove last element
        System.out.println("LinkedList after removing first and last element is : ");
        System.out.println(linkedList);
    }
}
