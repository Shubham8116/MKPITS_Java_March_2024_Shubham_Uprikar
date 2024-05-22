import java.util.*;
public class SortByComparable {
    public static void main(String[] args) {

        // creating List of students.
        List list1= Arrays.asList(new Student(90,"shubham"),new Student(80,"rahul"),new Student(10,"zooja"),new Student(5,"vaishnavi"));
        //passing List to Arraylist
        ArrayList<Student> student =new ArrayList<Student>(list1);
        //calling Collections class sort() method .
        Collections.sort(list1);
        System.out.println(list1);


    }



}
