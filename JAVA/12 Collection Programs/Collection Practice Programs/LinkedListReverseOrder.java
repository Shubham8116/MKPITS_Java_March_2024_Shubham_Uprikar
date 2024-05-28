import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//Write a Java program to iterate a linked list in reverse order.
public class LinkedListReverseOrder {
    public static void main(String[] args) {
        //creating LinkedList
        LinkedList linkedList = new LinkedList();
        linkedList.add(34);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(100);
        linkedList.add(68);
        linkedList.add(40);
        linkedList.add(26);
        System.out.println("The LinkedList elements in the reverse order are : ");
        //creating Iterator for the LinkedList
        ListIterator iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        // Iterating in the backword direction
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
