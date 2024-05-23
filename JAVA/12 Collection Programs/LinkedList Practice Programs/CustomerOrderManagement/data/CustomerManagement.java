// This class will perform basic operations on the class Customer
package CustomerOrderManagement.data;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class CustomerManagement {
    int count =0;
    LinkedList linkedList=new LinkedList();
    Iterator iterator;
    Customer customer;

    public void addCustomer(int id,String name,String product, int quantity, Date orderDate)
    {
        customer =new Customer(id,name,product,quantity,orderDate);
        linkedList.add(customer);
        System.out.println("new order created successfully");

    }
    public void removeCustomer(int searchTd)
    {
        count=0;
        iterator= linkedList.iterator();
        while (iterator.hasNext())
        {
            customer=(Customer) iterator.next();
            if (customer.getOrderId()==searchTd)
            {
                linkedList.remove(customer);
                System.out.println("order removed successfully !");
                count++;
            }
        }
        if (count==0)
            System.out.println("No record found with the given ID");
    }
    public void searchOrder(int searchID)
    {
        count=0;
        iterator= linkedList.iterator();
        while (iterator.hasNext())
        {
            customer=(Customer) iterator.next();
            if (customer.getOrderId()==searchID)
            {
                System.out.println("The info of order is as follows : ");
                System.out.println(customer);
                count++;
            }
        }
        if (count==0)
            System.out.println("No record found with the given ID");
    }
    public void displayTask()
    {
        if(linkedList.size()!=0) {
            System.out.println("Orders according to due Date");
            Collections.sort(linkedList, new DateComparator());
            System.out.println(linkedList);
        }
        else
            System.out.println("It is empty");

    }

}
