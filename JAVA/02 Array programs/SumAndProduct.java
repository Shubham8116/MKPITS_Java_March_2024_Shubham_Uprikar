//Java Program to Find the Sum and Product of Elements in a Row/Column .

import java.util.Scanner;

public class SumAndProduct {
    public void displayResult()
    {
        int array[][]=new int[3][3];
        Scanner scanner=new Scanner(System.in);
// taking array elements from the user.
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.println("enter array["+i+"]["+j+"] value");
                array[i][j]= scanner.nextInt();

            }

        }
// displaying array elements .
        System.out.println("The elements are :");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {

                System.out.print(array[i][j]);
                System.out.print(" ");

            }
            System.out.println();

        }
            System.out.println("The sum of row 1 is "+(array[0][0]+array[0][1]+array[0][2]));
            System.out.println("The product of row 1 is "+(array[0][0]*array[0][1]*array[0][2]));
            System.out.println("The sum of row 2 is "+(array[1][0]+array[1][1]+array[1][2]));
            System.out.println("The product of row 2 is "+(array[1][0]*array[1][1]*array[1][2]));
            System.out.println("The sum of row 3 is "+(array[2][0]+array[2][1]+array[2][2]));
            System.out.println("The product of row 3 is "+(array[2][0]*array[2][1]*array[2][2]));


        }
    }

