package Unique_VisitorTracker.data;

import java.util.HashSet;
import java.util.Iterator;

public class VisitorManagement {
    static int increament_Id = 1;
    int count = 0;
    HashSet hashSet = new HashSet();
    Visitor visitor;
    Iterator iterator;


    public void addVisitor(String IP) {
        visitor = new Visitor(IP, increament_Id);
        increament_Id++;
        hashSet.add(visitor);
        System.out.println("IP address added successfully");
    }

    public void checkVisitor(String IP) {
        count = 0;
        iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            visitor = (Visitor) iterator.next();
            if (visitor.getIP().equalsIgnoreCase(IP))
            {
                System.out.println("The visitor details are");
                System.out.println(visitor);
                count++;
                return;
            }
        }
        if (count == 0)
            System.out.println("Sorry no records found with the given IP");
    }


    public void removeVisitor(String IP) {
        count = 0;
        iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            visitor = (Visitor) iterator.next();
            if (visitor.getIP().equalsIgnoreCase(IP))
            {
                hashSet.remove(visitor);
                System.out.println("The visitor details are removed");
                count++;
                return;
            }
        }
        if (count == 0)
            System.out.println("Sorry no records found with the given IP");

    }

    public void displayVisitor()
    {
        if (hashSet.isEmpty())
            System.out.println("Visitors data is empty");
        else {
            System.out.println("The details of visitors are : ");
            System.out.println(hashSet);
        }
    }
}

