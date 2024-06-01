// **Sliding Window Maximum**: Write a Java program to find the maximum value in every sliding window of size k in a given array using the ArrayDeque class. Implement an efficient algorithm that maintains a deque of indices representing elements within the current window.
package arraydeque_programs;

import java.util.ArrayDeque;
import java.util.Arrays;

public class SlidingWindowMaximum {
    public void findGreaterInWindow(int array[])
    {
        int value1,value2,value3;
        //creating ArrayDeque object
        ArrayDeque   arrayDeque=new ArrayDeque();
        for (int i = 0; i < array.length ; i++) {
            //adding elements in the ArrayDeque
            arrayDeque.add(array[i]);

        }
        for (int i = 0;  i< array.length/3 ; i++)
        {
            value1=Integer.parseInt(arrayDeque.getFirst().toString());
            arrayDeque.pollFirst();
            value2=Integer.parseInt(arrayDeque.getFirst().toString());
            arrayDeque.pollFirst();
            value3=Integer.parseInt(arrayDeque.getFirst().toString());
            arrayDeque.pollFirst();
            System.out.println("The first window of 3 elements is "+value1+" "+value2+" "+value3);
            System.out.println("The grater number is : "+Math.max(value1,Math.max(value2,value3)));
        }
    }

    public static void main(String[] args) {
        //creating array of elements
        int array[]=new int[12];
        array[0]=34;
        array[1]=1000;
        array[02]=4;
        array[3]=567;
        array[4]=346;
        array[5]=90;
        array[6]=679;
        array[7]=40;
        array[8]=11;
        array[9]=18790;
        array[10]=789;
        array[11]=489;
        System.out.println("the array is : "+ Arrays.toString(array));
        //creating object of the class and calling method
        SlidingWindowMaximum max=new SlidingWindowMaximum();
        max.findGreaterInWindow(array);
    }
}
