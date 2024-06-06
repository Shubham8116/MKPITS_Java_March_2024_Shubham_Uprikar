//this class will store student data
package problem_6.data;

import java.util.*;

public class StoreStudent {
    HashMap<String,String> hashMap=new HashMap<>();
    public void store(String name,String grade)
    {
        hashMap.put(name, grade);
    }
    public void read()
    {
        System.out.println("The student data is : ");
        for (Map.Entry a: hashMap.entrySet())
        {
            System.out.println(a.getKey()+" : "+a.getValue());

        }

    }
    public void update(String name)
    {
        int count =0;
        for (Map.Entry a:hashMap.entrySet())
        {
            if (a.getKey().equals(name))
            {
                System.out.println("enter new grade");
                Scanner scanner=new Scanner(System.in);
                hashMap.replace(a.getKey().toString(), scanner.next());
                System.out.println("new grade updated successfully");
                count++;
            }
        }
        if (count==0)
            System.out.println("Enter correct key");
    }
    public void remove(String name)
    {
        int count=0;
        for (Map.Entry a:hashMap.entrySet())
        {
            if (a.getKey().equals(name))
            {
            hashMap.remove(a.getKey());
             count++;
            }
        }
            if (count==0)
                System.out.println("Enter correct key");
    }
    public void searchStudent(String name)
    {
        int count=0;
        for (Map.Entry a:hashMap.entrySet())
        {
            if (a.getKey().equals(name))
            {
                System.out.println("The grade is : "+a.getValue());
            }
        }
        if (count==0)
            System.out.println("Enter correct key");
    }
}
