// implementing LinkedList in java
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {


public static void main(String[] args) {
    LinkedList <Integer>linkedList=new LinkedList<Integer>(); // creating Integer type LinkedList
    linkedList.add(67); // adding values to linkedlist
    linkedList.add(100);
    linkedList.add(56);
    linkedList.add(90);
    System.out.println(linkedList);
    //linkedList.add(0,"shubham");// will give error because type of linkedlist is Integer.
    linkedList.addFirst(10);
    linkedList.addLast(20);
    System.out.println(linkedList);
    System.out.println(linkedList.get(2));
    Collections.sort(linkedList);// sorting LinkedList .
    for(Object o:linkedList)
    {
        System.out.println(o);
    }
    if (linkedList.contains(67))
    {
        System.out.println("object found");
    }
    System.out.println("Iterating through Iteration");
    Iterator iterator=linkedList.iterator();// implementing Iterator interface
    while (iterator.hasNext()) // iterating through Iterator.
    {
       // System.out.println(iterator.next());
        if (Integer.parseInt(iterator.next().toString())==90)
            System.out.println("success");

    }
}

}