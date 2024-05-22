import java.util.*;
public class QueueInterfaceDemo {
    public static void main(String[] args) {
        Queue q=new LinkedList();
        q.add(65);//adding element to queue using Collection interface method
        q.add(34);
        q.offer(78);//adding element to queue using Queue method
        q.offer(90);
        System.out.println(q);
        System.out.println(q.peek());//displays first element using Queue method
        System.out.println(q.element());//displays first element using Collection class method
        q.remove();// will remove first element in the queue using Collection class method
        q.poll();// will remove first element in the queue using Queue method .
        System.out.println(q);




    }
}
