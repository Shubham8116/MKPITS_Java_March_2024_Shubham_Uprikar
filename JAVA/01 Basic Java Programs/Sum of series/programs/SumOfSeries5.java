//Java Program to Add the nth Square Series .
package programs;

public class SumOfSeries5 {
    public void displaySum(double numberofterm)
    {
      double sum=0;
        for (int i = 1; i <=numberofterm ; i++)
        {
            sum=sum+(Math.pow(i,2));
        }
        System.out.println("The sum of serie for 1^2+2^2+3^2+4^2..."+numberofterm+"^2"+" is : "+sum);
    }
}
