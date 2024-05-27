import java.util.LinkedList;
import java.util.Scanner;

//Write a Java program to insert the specified element at the front of a linked list.
public class LinkedListInsertionAtFirst {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(34);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(100);
        linkedList.add(68);
        linkedList.add(40);
        linkedList.add(26);
        System.out.println("The LinkedList elements are : ");
        System.out.println(linkedList);
        System.out.println("Enter integer element to add at first position in the LinkedList");
        Scanner scanner = new Scanner(System.in);//creating Scanner object to take input from user
        int value = scanner.nextInt();
        linkedList.addFirst(value);//adding element at the first position
        System.out.println("Elements after inserting specific element at the first position");
        System.out.println(linkedList);

    }
}

