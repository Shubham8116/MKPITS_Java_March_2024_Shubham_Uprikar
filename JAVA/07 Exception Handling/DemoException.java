//program to demonstrate exception.
package data;

import java.util.Scanner;

public class DemoException {
    public void display()
    {
        int array[]={1,2,3,4,5};
        try{
            for (int i = 0; i <= array.length+1; i++)
            {
                // trying to access index no. 5 which is not present in the array.
                System.out.println(array[i]);
            }

        }
       // catch block will catch exception.
       catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You are calling non existing element in the array");

        }
        try
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the value of a");
            int a= scanner.nextInt();
            System.out.println("Enter the value of b");
            int b= scanner.nextInt();
            System.out.println(a/b);
        }
       // catch block will catch exception.
        catch(ArithmeticException e)
        {
            System.out.println("divide by zero error");
        }

        finally {
            System.out.println("The program is now closing");// finally() method always called irrespective of exception.
        }


    }
    }

