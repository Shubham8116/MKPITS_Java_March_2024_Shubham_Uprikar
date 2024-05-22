//Java Program to Find Sum of the Series 1/1+1/4+1/9+…1/N^2 .
package programs;

public class SumOfSeries4 {
    public void displaySum(double numberofterm)
    {
        double a;
        double sum=0;
        for (int i = 1; i <=numberofterm ; i++)
        {

            sum=sum+(1/Math.pow(i,2));
        }
        System.out.println("The sum of series 1/1+1/4+1/9+1/16 upto 1/"+Math.pow(numberofterm,2)+" is : "+sum);

    }

}
