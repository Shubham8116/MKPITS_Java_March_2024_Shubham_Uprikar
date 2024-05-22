// Main class to call Contractor class and FullTimeEmployee class.
import data.Contractor;
import data.FullTimeEmployee;

public class Main {
    public static void main(String[] args) {
        Contractor c=new Contractor("shubham",500,14);
        System.out.println("the salary of contractor is");
        System.out.println(  c.calculateSalary());
        FullTimeEmployee f=new FullTimeEmployee("sneha",1000,12);
        System.out.println("the salary of full time employee is");
        System.out.println(f.calculateSalary());
    }
}
