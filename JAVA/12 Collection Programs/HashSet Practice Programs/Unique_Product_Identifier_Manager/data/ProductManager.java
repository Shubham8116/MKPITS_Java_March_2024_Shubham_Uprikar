package Unique_Product_Identifier_Manager.data;

import java.util.HashSet;

public class ProductManager {
    HashSet<String> hashSet=new HashSet();

    public void addIdentifier(String name)
    {
        hashSet.add(name);
        System.out.println("Item added successfully !");

    }
    public void checkIdentifier(String check)
    {
        if (hashSet.contains(check))
            System.out.println("Found successfully");
        else
            System.out.println("Not found");
    }
    public void removeIdentifier(String remove)
    {
        if(hashSet.remove(remove))
            System.out.println("removed successfully");
        else
            System.out.println("not found");
    }
    public void displayIdentifier()
    {
        System.out.println("All identifiers as follows : ");
        System.out.println(hashSet);
    }
}
