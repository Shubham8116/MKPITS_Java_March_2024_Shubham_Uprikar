// creating Comparator to sort the tasks according to duedate.
package CustomerOrderManagement.data;

import TaskManagementSystem.data.Tasks;

import java.util.Comparator;

public class DateComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer t1, Customer t2) {
        if (t1.getOrderDate().compareTo(t2.getOrderDate())==0)
            return 0;
        else if (t1.getOrderDate().compareTo(t2.getOrderDate())>0)
            return 1;
        else return -1;
    }
}
