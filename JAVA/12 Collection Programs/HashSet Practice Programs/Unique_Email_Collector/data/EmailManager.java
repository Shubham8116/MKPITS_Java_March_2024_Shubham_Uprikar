package Unique_Email_Collector.data;

import java.util.*;

public class EmailManager {
    static int number=0;
    int count=0;
    HashSet  hashSet=new HashSet();
    Email  email;
    Iterator iterator;
    public void addEmail(String inputEmail)
    {
        number++;
        email=new Email(number,inputEmail);
        hashSet.add(email);
        System.out.println("Email added successfully");
    }
    public void removeEmail(String removeEmail)
    {
        count=0;
        iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            email=(Email)iterator.next();
            if(email.getEmail().equalsIgnoreCase(removeEmail))
            {
                hashSet.remove(email);
                System.out.println("Email removed successfully");
                count++;
                return ;
            }
        }
        if (count==0)
            System.out.println("Sorry no records found with the given email");
    }
    public void checkExists(String searchEmail)
    {
        count=0;
        iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            email=(Email)iterator.next();
            if(email.getEmail().equalsIgnoreCase(searchEmail))
            {
                System.out.println("Email found successfully");
                count++;
            }
        }
        if (count==0)
            System.out.println("Sorry no records found with the given email");
    }
    public void display()
    {
        if (hashSet.isEmpty())
            System.out.println("No records found ");
            else
        {
            System.out.println("All stord emails as follows : ");
            for (Object o : hashSet) {
                System.out.println(o);
                System.out.println(" ");
            }
        }

    }
}
