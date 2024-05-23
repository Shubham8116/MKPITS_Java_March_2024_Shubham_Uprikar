// This class will perform basic operations on Tasks class .
package TaskManagementSystem.data;

import java.time.LocalDate;
import java.util.*;

public class TaskOperations {
    int count =0;
    LinkedList linkedList=new LinkedList();
    Iterator  iterator;
    Tasks task;

    public void addTask(int id,String name,int priority, LocalDate dueDate)
    {
        task =new Tasks(id,name,priority,dueDate);
        linkedList.add(task);
        System.out.println("new task created successfully");

    }
    public void removeTask(int searchTd)
    {
        count=0;
        iterator= linkedList.iterator();
        while (iterator.hasNext())
        {
            task=(Tasks)iterator.next();
            if (task.getTaskId()==searchTd)
            {
                linkedList.remove(task);
                System.out.println("Task removed successfully !");
                count++;
            }
        }
        if (count==0)
            System.out.println("No record found with the given ID");
    }
    public void searchTask(int searchID)
    {
        count=0;
        iterator= linkedList.iterator();
        while (iterator.hasNext())
        {
            task=(Tasks)iterator.next();
            if (task.getTaskId()==searchID)
            {
                System.out.println("The info of task is as follows : ");
                System.out.println(task);
            }
        }
        if (count==0)
            System.out.println("No record found with the given ID");
    }
    public void displayTask()
    {
        if(linkedList.size()!=0) {
            System.out.println("Tasks according to due Date");
            Collections.sort(linkedList, new DateComparator());
            System.out.println(linkedList);
        }
        else
            System.out.println("It is empty");

    }
}
