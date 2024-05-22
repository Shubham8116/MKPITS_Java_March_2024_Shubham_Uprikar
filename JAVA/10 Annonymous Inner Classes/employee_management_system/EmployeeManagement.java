// showcasing anonymous inner classes by implementing the Employee interface.
//Here different annonymous inner claases are created for full time, part time and contractual employee.

package employee_management_system;

public class EmployeeManagement {
    public void display() {

        Employee employee1 = new Employee() {
            @Override
            public void calculateSalary() {
                System.out.println("Calculating salary for the full time employee");

            }

            @Override
            public void displayDetails() {
                System.out.println("Displaying details for the full time employee");

            }
        };
        Employee employee2 = new Employee() {

            public void calculateSalary() {
                System.out.println("Calculating salary for the part time employee");

            }

            public void displayDetails() {
                System.out.println("Displaying details for the part time employee");

            }
        };
        Employee employee3 = new Employee() {
            @Override
            public void calculateSalary() {
                System.out.println("Calculating salary for the on contract employee");

            }

            @Override
            public void displayDetails() {
                System.out.println("Displaying details for the on contract employee");

            }
        };
        //calling the overrided methods of employee interface.
        employee1.calculateSalary();
        employee1.displayDetails();
        employee2.calculateSalary();
        employee2.displayDetails();
        employee3.calculateSalary();
        employee3.displayDetails();
    }

}
