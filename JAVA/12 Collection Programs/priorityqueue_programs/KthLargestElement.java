//**Kth Largest Element in an Array**: Implement a Java program to find the kth largest element in an unsorted array using the PriorityQueue class.
// The program should efficiently find the kth largest element by maintaining a priority queue of size k.
package priorityqueue_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
    public int largest(int array[],int k) {
        //creating comparator object for polling larger number from Queue
        Comparator comparator=Comparator.reverseOrder();
        //creating PriorityQueue with comparator object
        PriorityQueue priorityQueue = new PriorityQueue(comparator);
        for (int i : array) {
            priorityQueue.offer(i);
        }
        if (k > priorityQueue.size()||k==0) {
            System.out.println("Index is out of range");
            return 0;
        }
        else
        {
            for (int i =k; i>1; i--)
            {
                priorityQueue.poll();
            }
            // returning kth largest number
            return Integer.parseInt(priorityQueue.poll().toString());
        }

    }

    public static void main(String[] args) {
        //creating unsorted array
        int array[]={89,56,34,78,1,3,90,347,2,65};
        System.out.println("The unsorted array is : "+ Arrays.toString(array));
        System.out.println("Enter kth largest value to find it ");
        //taking input from user
        Scanner  scanner=new Scanner(System.in);
        int k= scanner.nextInt();
        KthLargestElement kthLargestElement=new KthLargestElement();
        //calling method
        int result =kthLargestElement.largest(array,k);
        System.out.println("The "+k+"th largest element is : "+result);



    }
}
