import java.util.LinkedList;

//Write a Java program to replace an element in a linked list.
public class LinkedListReplaceElement {
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
        System.out.println("LinkedList after replacing 2nd element with value 370");
        linkedList.set(1,370); //updating LinkedList
        System.out.println(linkedList);
    }
}
