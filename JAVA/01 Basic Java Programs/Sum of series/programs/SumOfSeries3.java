//Java Program to Find Sum of the Series 1/1!+1/2!+1/3!+…1/N!
package programs;

public class SumOfSeries3 {

    public int fact(double i)
    {
        int fact=1;
        for (int j = 1; j <= i; j++) {
            fact=fact*j;

        }


        return fact;
    }
   public void displaySum(double numberofterm)
    {
        double a;
        double sum=0;
        for (int i = 1; i <=numberofterm ; i++)
        {
            a=fact(i);
            sum=sum+(1/a);
        }
        System.out.println("The sum of series 1/1!+1/2!+1/3!+1/4! upto 1/"+numberofterm+"! is : "+sum);

    }

}
