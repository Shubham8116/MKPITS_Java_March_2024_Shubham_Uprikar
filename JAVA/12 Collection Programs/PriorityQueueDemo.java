//program to demonstrate PriorityQueue .
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
// creating PriorityQueue
        Queue<Integer> q=new PriorityQueue();
        q.add(78);//adding elements
        q.add(13);
        q.add(14);
        q.add(67);
        q.add(100);
        q.add(2);
        System.out.println(q);// printing elements in the PriorityQueue
        System.out.println(q.poll());//will remove smallest element 2.
        System.out.println(q.poll());//will remove second smallest element 13.
        System.out.println(q.poll());

// creating Max Heap for the PriorityQueue
        Comparator c=Comparator.reverseOrder();
        Queue<Integer> newQueue=new PriorityQueue(c);
        newQueue.add(78);//adding elements
        newQueue.add(13);
        newQueue.add(14);
        newQueue.add(67);
        newQueue.add(100);
        newQueue.add(2);
        System.out.println(newQueue);// printing elements in the PriorityQueue
        System.out.println(newQueue.poll());//will remove largest element 100.
        System.out.println(newQueue.poll());//will remove second largest element 78.
        System.out.println(newQueue.poll());


    }
}
