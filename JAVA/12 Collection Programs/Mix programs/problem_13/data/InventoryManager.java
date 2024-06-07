//this class will manage Inventories
package problem_13.data;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class InventoryManager {
    //creating LinkedHashmap
    LinkedHashMap<String,Integer> hashMap=new LinkedHashMap<>();
    public void addItem(String name,int qty)
    {
        hashMap.put(name,qty);//adding items
        System.out.println("item added successfully");
    }
    public void deleteItem(String name)
    {
        int count=0;

        for (Map.Entry a: hashMap.entrySet())
    {
        if (a.getKey().toString().equals(name))
        {
            hashMap.remove(a.getKey());//removing item
            System.out.println("item removed successfully");
            count++;
            return;
        }
    }
        if (count==0)
            System.out.println("enter correct name");

    }
    public void display()
    {
        for (Map.Entry a: hashMap.entrySet())//looping through LinkedHashMap
        {
            System.out.println("the item is : "+a.getKey());
            System.out.println("the quantity is : "+a.getValue());
            System.out.println(" ");
        }
    }

}
