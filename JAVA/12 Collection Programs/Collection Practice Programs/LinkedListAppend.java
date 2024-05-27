import java.util.LinkedList;

//Write a Java program to append the specified element to the end of a linked list.
public class LinkedListAppend {
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
        //appending element at the last position
        linkedList.addLast(1000);
        System.out.println("after appending element at the last position");
        System.out.println(linkedList);
        
    }
}
