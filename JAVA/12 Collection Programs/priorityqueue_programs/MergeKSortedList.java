//**Merge K Sorted Lists**: Write a Java program to merge k sorted lists into one sorted list using the PriorityQueue class. The program should efficiently merge the lists by continually selecting the smallest element among the heads of the lists using a priority queue.
package priorityqueue_programs;

import java.util.*;

public class MergeKSortedList {
    public void mergeList(List list1,List list2,List list3,List list4)
    {
        int length=list1.size();
        //creating PriorityQueue for each List
        PriorityQueue   priorityQueue1=new PriorityQueue(list1);
        PriorityQueue   priorityQueue2=new PriorityQueue(list2);
        PriorityQueue   priorityQueue3=new PriorityQueue(list3);
        PriorityQueue   priorityQueue4=new PriorityQueue(list4);
        List mergeList=new ArrayList();
        for (int i = 0; i <length ; i++)
        {
            //merging Lists
         mergeList.add(priorityQueue1.poll());
            mergeList.add(priorityQueue2.poll());
            mergeList.add(priorityQueue3.poll());
            mergeList.add(priorityQueue4.poll());
            Collections.sort(mergeList);//sorting Lists

        }

        System.out.println("The final List is : "+mergeList);
    }
    public static void main(String[] args) {
        //creating object of the class
        MergeKSortedList mergeKSortedList=new MergeKSortedList();
        //creating fixed size sorted list
        List<Integer> list1= Arrays.asList(13,56,78,90);
        System.out.println("List 1 is : "+list1);
        List<Integer> list2= Arrays.asList(2,345,567,903);
        System.out.println("List 2 is : "+list2);
        List<Integer> list3= Arrays.asList(56,567,3454,9000);
        System.out.println("List 3 is : "+list3);
        List<Integer> list4= Arrays.asList(1,8,90,1000);
        System.out.println("List 4 is : "+list4);
        System.out.println("Merging Lists");
        //calling method to merge the lists
        mergeKSortedList.mergeList(list1,list2,list3,list4);
    }
}
