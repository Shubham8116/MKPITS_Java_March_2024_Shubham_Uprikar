import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortByComparator {
    public static void main(String[] args) {

        // creating List of students.
        List list1= Arrays.asList(new Student(90,"shubham"),new Student(80,"rahul"),new Student(10,"zooja"),new Student(5,"vaishnavi"));
        //passing List to Arraylist
        ArrayList<Student> student =new ArrayList<Student>(list1);
        //calling Collections class sort() method to sort students by name.
        Collections.sort(list1,new nameComparator());
        System.out.println(list1);
        //calling Collections class sort() method to sort students by marks.
        Collections.sort(list1,new marksComparator());
        System.out.println(list1);


    }

}
