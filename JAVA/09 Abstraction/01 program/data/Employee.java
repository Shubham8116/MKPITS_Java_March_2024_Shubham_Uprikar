//declaring abstract class Employee
package data;

public abstract class Employee {
   String name;
   double paymentPerHour;

   public Employee(String name,double paymentPerHour)
   {
      this.name=name;
      this.paymentPerHour=paymentPerHour;
   }
//declaring abstract method
   public abstract double calculateSalary();
   public void message()
   {
      System.out.println("welcome");
   }
}
