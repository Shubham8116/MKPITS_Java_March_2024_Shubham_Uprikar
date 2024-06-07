//this class will perform operations for the employees
package problem_11;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    HashMap<Integer,String> hashMap=new HashMap();
    public void addEmployee(int id, String details)
    {
        hashMap.put(id,details);
        System.out.println("Employee added successfully !");
    }
    public void removeEmployee(int id)
    {
        int count=0;
        for (Map.Entry a:hashMap.entrySet())
        {
            if (Integer.parseInt(a.getKey().toString())==id)
            {
                hashMap.remove(a.getKey());//will remove employee using key
                System.out.println("employee removed successfully");
                count++;
                return;
            }
        }
        if (count==0)
            System.out.println("enter correct name");

    }
    public void updateEmployee(int id,String change )
    {
        int count=0;
        for (Map.Entry a:hashMap.entrySet())
        {
            if (Integer.parseInt(a.getKey().toString())==id)
            {
                hashMap.replace(id,change);//will update employee using key
                System.out.println("Employee updated successfully");
                count++;
                return;
            }
        }
        if (count==0)
            System.out.println("enter correct name");
    }
    public void display()
    {
        System.out.println("Employees are : ");
        for (Map.Entry a:hashMap.entrySet())//looping through stored employees
        {
            System.out.println("The employee is : "+a.getKey());//printing key
            System.out.println("The details are: "+a.getValue());//printing value

        }
    }
}
