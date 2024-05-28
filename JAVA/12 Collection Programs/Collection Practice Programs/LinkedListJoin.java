import java.util.LinkedList;

//Write a Java program to join two linked lists.
public class LinkedListJoin {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(34);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(100);
        linkedList.add(68);
        linkedList.add(40);
        linkedList.add(26);
        System.out.println("The LinkedList 1 elements are : ");
        System.out.println(linkedList);
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add("shubham");
        linkedList1.add("rahul");
        linkedList1.add("pooja");
        linkedList1.add("komal");
        linkedList1.add("sneha");
        System.out.println("The LinkedList 2 elements are : ");
        System.out.println(linkedList1);
        System.out.println("joining LinkedList 1 with linkedList 2");
        linkedList.addAll(linkedList1);
        System.out.println(linkedList);


    }
}
