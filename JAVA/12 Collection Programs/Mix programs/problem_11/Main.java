//### Problem 11: Employee Records System
//**Objective:** Develop an employee records management system.
//
//**Requirements:**
//- Use `HashMap` to store employee IDs as keys and employee details as values.
//- Implement functionalities to add, update, delete, and retrieve employee records.
//- Provide a method to list all employees.
package problem_11;

import problem_10.data.WordDictionary;

public class Main {
    public static void main(String[] args) {

        Employee   employee=new Employee();
        //adding employees
        employee.addEmployee(1,"shubham kumar");
        employee.addEmployee(2,"pallavi sahare");
        employee.addEmployee(3,"pit robinson");
        employee.addEmployee(4,"david miller");
        employee.addEmployee(5,"mr. nobody");
        employee.addEmployee(6,"sam altman");
        employee.display();
        employee.removeEmployee(3);//removing employee having id 3
        employee.updateEmployee(4,"bhaiya ji");//updating employee having id 4
        employee.display();
    }
}
