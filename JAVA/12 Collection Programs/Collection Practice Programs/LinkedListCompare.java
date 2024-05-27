import java.util.LinkedList;

//Write a Java program to compare two linked lists.
public class LinkedListCompare {
    public static void main(String[] args) {
        //creating 1st LinkedList
        LinkedList linkedList=new LinkedList();
        linkedList.add(34);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(100);
        linkedList.add(68);
        linkedList.add(40);
        linkedList.add(26);
        System.out.println("The LinkedList 1 elements are : ");
        System.out.println(linkedList);
//creating 2nd LinkedList
        LinkedList linkedList1=new LinkedList();
        linkedList1.add(34);
        linkedList1.add(2);
        linkedList1.add(4);
        linkedList1.add(100);
        linkedList1.add(68);
        linkedList1.add(40);
        linkedList1.add(26);
        System.out.println("The LinkedList 2 elements are : ");
        System.out.println(linkedList1);
        System.out.println(linkedList.equals(linkedList1));//comparing LinkedList 1 with LinkedList 2
    }
}
