// program to demonstrate ListIterator .
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
// creating LinkedList for Iterator .
        LinkedList linkedList=new LinkedList();
        linkedList.add(78);
        linkedList.add(90);
        linkedList.add(13);
        linkedList.add(34);
        System.out.println(linkedList);
        ListIterator itr=linkedList.listIterator();// creating ListIterator .
        // going in forward direction .
        while(itr.hasNext())
        {

            System.out.println("Item at index : "+itr.nextIndex()+" is : "); // printing index of element.
            System.out.println(itr.next());

        }
        // going in backword direction
        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }

    }
}
