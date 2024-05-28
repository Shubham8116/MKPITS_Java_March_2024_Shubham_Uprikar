import java.util.Iterator;
import java.util.LinkedList;

//Write a Java program to iterate through all elements in a linked list.
public class LinkedListIteration {
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
        //creating Iterator for the LinkedList
        Iterator  iterator=linkedList.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
