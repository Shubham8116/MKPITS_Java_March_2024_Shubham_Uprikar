//Java Program to Find Sum of Series 1^2 + 2^2 + …. + n^2.
package programs;

public class SumOfSeries1 {
    public void displaySum(int numberofterm)
    {
        double sum=0;
        for (int i = 1; i <= numberofterm; i++)
        {
            sum=sum+(Math.pow(i,2));
        }
        System.out.println("The sum of series 1^1+2^2+3^3+4^4 upto "+numberofterm+"^2"+" is : "+sum );

    }
}
