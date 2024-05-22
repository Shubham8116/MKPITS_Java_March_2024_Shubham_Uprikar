//Final Method in Inheritance Hierarchy: Create a final method "displayInfo" in a base class "Person" for displaying basic information like name and age.
//Extend this class to create derived classes like "Student" and "Teacher" and ensure that the "displayInfo" method cannot be overridden.
import data.Student;
import data.Teacher;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("shubham",26);
        Teacher teacher=new Teacher("sneha",24);
    }
}
