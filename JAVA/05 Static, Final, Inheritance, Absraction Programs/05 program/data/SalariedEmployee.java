package data;

public class SalariedEmployee extends Employee{
    double salary=70000;
    String employee1="pooja";
    String employee2="komal";
    @Override
    public void calculateSalary() {
        System.out.println("The new salary is "+salary);
    }

    @Override
    public void displayEmployee() {
        System.out.println("employees are :" +employee1+" and "+employee2);
    }
}
