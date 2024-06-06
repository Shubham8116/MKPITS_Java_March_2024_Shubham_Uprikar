//this class will store contacts
package problem_9.data;

import java.util.Map;
import java.util.TreeMap;

public class StoreContacts {
    TreeMap<String,Long>  treeMap=new TreeMap();
    public void addContact(String name,long number)
    {
        treeMap.putIfAbsent(name, number);
        System.out.println("Contact added successfully");
    }
    public void deleteContact(String name)
    {
        int count=0;
        for (Map.Entry a:treeMap.entrySet())
        {
            if (a.getKey()==name)
            {
                treeMap.remove(a.getKey());//will remove contact using key
                System.out.println("Contact removed successfully");
                count++;
                return;
            }
        }
        if (count==0)
            System.out.println("enter correct name");

    }
    public void displaycontact()
    {
        System.out.println("Contacts are : ");
        for (Map.Entry a:treeMap.entrySet())//looping through stored contacts
        {
            System.out.println("The name is : "+a.getKey());//printing key
            System.out.println("Number is : "+a.getValue());//printing value

        }
    }


}


