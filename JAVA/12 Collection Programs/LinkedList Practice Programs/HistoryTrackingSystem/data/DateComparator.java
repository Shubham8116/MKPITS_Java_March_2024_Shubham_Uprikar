// creating Comparator to sort the tasks according to duedate.
package HistoryTrackingSystem.data;

import TaskManagementSystem.data.Tasks;

import java.util.Comparator;

public class DateComparator implements Comparator<History> {
    @Override
    public int compare(History h1, History h2) {
        if (h1.visitDate.compareTo(h2.visitDate)==0)
            return 0;
        else if (h1.visitDate.compareTo(h2.visitDate)>0)
            return 1;
        else return -1;
    }
}
