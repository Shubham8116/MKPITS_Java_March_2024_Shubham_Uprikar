// extending abstract class to use its methods.
package data;

public class Contractor extends Employee {
   int workingHour;
    public Contractor(String name,double paymentPerhour,int workingHour)
    {
        super(name,paymentPerhour);
        this.workingHour=workingHour;

    }
    @Override
    public double calculateSalary() {

        return paymentPerHour*workingHour;

    }
}
