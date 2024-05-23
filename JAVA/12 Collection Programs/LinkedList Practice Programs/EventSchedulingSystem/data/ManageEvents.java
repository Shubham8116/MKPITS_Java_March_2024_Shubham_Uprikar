//ManageEvents class to perform basic operations on Events
package EventSchedulingSystem.data;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ManageEvents {
    int count=0;
    Events events;
    LinkedList  linkedList=new LinkedList();
    Iterator iterator;

    public void addEvent(int id, String name, String location, LocalDate date)
    {
        events=new Events(id,name,location,date);
        linkedList.add(events);
        System.out.println("Event added successfully !");
    }
    public void removeEvent(int ID)
    {
        count=0;
        iterator=linkedList.iterator();
        while (iterator.hasNext())
        {
            events=(Events)iterator.next();
            if (events.eventID==ID)
            {
                linkedList.remove(events);
                System.out.println("Event removed successfully !");
                count++;
            }
        }
        if (count==0)
            System.out.println("No records found with the given ID");
    }
    public void searchEvent(String name)
    {
        count=0;
        iterator=linkedList.iterator();
        while (iterator.hasNext())
        {
            events=(Events)iterator.next();
            if (events.eventName.equalsIgnoreCase(name))
            {
                System.out.println("Event details as follows : ");
                System.out.println(events);
                count++;
            }
        }
        if (count==0)
            System.out.println("No records found with the given ID");

    }
    public void displayEvent()
    {
        if(linkedList.isEmpty()) {
            System.out.println("No data found");

        }
        else
        {
            System.out.println("Events details as follows : ");
            Collections.sort(linkedList, new LocationComparator());
            System.out.println(linkedList);
        }

    }
}
