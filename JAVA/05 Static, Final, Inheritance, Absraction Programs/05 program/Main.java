//Abstract Employee Management System: Design an abstract class "Employee" with abstract methods for calculating salary and displaying employee information.
//Implement concrete classes like "HourlyEmployee" and "SalariedEmployee" inheriting from the Employee class, each with its own salary calculation logic.
import data.HourlyEmployee;
import data.SalariedEmployee;

public class Main {
    public static void main(String[] args) {
        //HourlyEmployee hourlyEmployee=new HourlyEmployee();
        //hourlyEmployee.calculateSalary();
        //hourlyEmployee.displayEmployee();
        SalariedEmployee employee=new SalariedEmployee();
        employee.calculateSalary();
        employee.displayEmployee();
    }
}
