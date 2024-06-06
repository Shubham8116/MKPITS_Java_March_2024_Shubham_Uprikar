// Problem 6: Student Grades Management
//**Objective:** Implement a program to manage student grades using a map.
//
//**Requirements:**
//- Use `HashMap` to store student names as keys and their grades as values.
//- Provide functionalities to add, update, delete, and retrieve grades.
//- Display the list of all students and their grades.
package problem_6;

import problem_6.data.StoreStudent;

public class Main {
    public static void main(String[] args) {
        StoreStudent storeStudent=new StoreStudent();
        storeStudent.store("ben","A+");
        storeStudent.store("sam","C");
        storeStudent.store("bhai","B");
        storeStudent.store("komal","E");
        storeStudent.store("pooja","A");
        storeStudent.store("sneha","A+");
        storeStudent.read();//displaying elements of HashMap
        storeStudent.remove("komal");//removing elements from HashMap
        storeStudent.searchStudent("sneha");//searching student name and retrieving grades
    }
}
