package data;

public class HourlyEmployee extends Employee{
    double salary=45000;
    String employee1="shubham";
    String employee2="sneha";
    public void calculateSalary()
    {
        System.out.println("The new salary is "+salary);
    }
    public void displayEmployee()
    {
        System.out.println("employees are :" +employee1+" and "+employee2);

    }
}
