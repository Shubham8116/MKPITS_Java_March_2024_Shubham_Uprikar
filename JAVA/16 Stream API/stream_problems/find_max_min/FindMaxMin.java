//Finding Max and Min:
//Create a list of objects (e.g., custom objects with attributes like name and marks) and use a stream to find the topper and last objects based on a certain attribute (e.g., marks).
package stream_problems.find_max_min;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxMin {
    public static void main(String[] args) {
//creating List of type Student
        List<Student> list=new ArrayList<>();
        list.add(new Student("shubham",90));
        list.add(new Student("sneha",10));
        list.add(new Student("pooja",50));
        list.add(new Student("neha",30));
        list.add(new Student("akshay",70));
        list.add(new Student("shruti",80));
        System.out.println(list);
        //finding max marks of student and storing in the Optional class object
        Optional<Student> option=list.stream().max(Comparator.comparing(Student::getMarks));
        System.out.println("The topper is ");
        option.ifPresent(System.out::println);//printing student having max marks
        //finding min marks of student and storing in the Optional class object
        Optional<Student> option1=list.stream().min(Comparator.comparing(Student::getMarks));
        System.out.println("The last is ");
        option1.ifPresent(ss-> System.out.println(ss));//printing student having min marks
    }
}
