//Java Program to Find Sum of the Series 1/1! + 2/2! + 3/3! + ……1/N!.
package programs;

import java.math.BigInteger;

public class SumOfSeries2 {
    public int fact(double i)
    {
        int fact=1;
        for (int j = 1; j <= i; j++) {
            fact=fact*j;

        }


        return fact;
    }
    public void displaySum(int numberofterm)
    {
        double a=0;double sum=0;
        for (double i = 1; i <=numberofterm ; i++)
        {
         a=fact(i);

         sum=sum+(i/a) ;
        }
        System.out.println("The sum of series 1/1!+2/2!+3/3!+4/4! upto "+numberofterm+"/"+numberofterm+"! is : "+sum);
    }

}
