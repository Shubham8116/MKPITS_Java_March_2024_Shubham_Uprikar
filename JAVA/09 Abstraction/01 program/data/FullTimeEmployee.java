// extending abstract class to use its methods.
package data;

public class FullTimeEmployee extends Employee {
    int workingHour;
    public FullTimeEmployee(String name,double paymentPerHour,int workingHour)
    {
        super(name,paymentPerHour);
        this.workingHour=workingHour;

    }
    public double calculateSalary()
    {

        return paymentPerHour*workingHour*20;
    }


}
