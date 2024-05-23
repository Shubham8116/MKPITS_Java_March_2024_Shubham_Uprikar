package HistoryTrackingSystem.data;

import EventSchedulingSystem.data.Events;
import EventSchedulingSystem.data.LocationComparator;

import java.util.*;
import java.util.LinkedList;

public class HistoryManager {
    int count=0;
    LinkedList linkedList=new LinkedList();
    Iterator iterator;
    History history;

    public void addHistory(int id,String url,String title,Date date)
    {
        history=new History(id,url,title,date);
        linkedList.add(history);
        System.out.println("Page added successfully");
    }
    public void removePage(int id)
    {
        count=0;
        iterator=linkedList.iterator();
        while (iterator.hasNext())
        {
            history=(History) iterator.next();
            if (history.getPageId()==id)
            {
                linkedList.remove(history);
                System.out.println("Page removed successfully !");
                count++;
            }
        }
        if (count==0)
            System.out.println("No records found with the given ID");

    }
    public void searchPage(String url)
    {

        count=0;
        iterator=linkedList.iterator();
        while (iterator.hasNext())
        {
            history=(History) iterator.next();
            if (history.getUrl().equalsIgnoreCase(url))
            {
                System.out.println("Page details as follows : ");
                System.out.println(history);
                count++;
            }
        }
        if (count==0)
            System.out.println("No records found with the given ID");
    }
    public void displayPage()
    {
        if(linkedList.isEmpty())
        {
            System.out.println("No data found");

        }
        else
        {
            System.out.println("Page details as follows : ");
            Collections.sort(linkedList,new DateComparator());
            System.out.println(linkedList);
        }


    }

}
