import java.util.LinkedList;

// Write a Java program to display elements and their positions in a linked list.
public class DisplayLinkedList {
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
        //creating for loop for the LinkedList
        for (int i=0;i< linkedList.size();i++)
        {
            System.out.println("The element on the index "+i+" is : "+linkedList.get(i));
        }
    }
}
