// creating Comparator to sort the tasks according to duedate.
package TaskManagementSystem.data;

import java.util.Comparator;

public class DateComparator implements Comparator<Tasks> {
    @Override
    public int compare(Tasks t1, Tasks t2) {
        if (t1.getDueDate().compareTo(t2.dueDate)==0)
            return 0;
        else if (t1.getDueDate().compareTo(t2.dueDate)>0)
            return 1;
        else return -1;
    }
}
