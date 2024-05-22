//Java Program to Display Upper Triangular Matrix .

import java.util.Scanner;

public class UpperTriangularMatrix {
    public void dispalyResult() {
        int array[][] = new int[3][3];
        int result[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
// taking array elements from the user .
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter array[" + i + "][" + j + "] value");
                array[i][j] = scanner.nextInt();

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
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if(i>j)
                {
                    result[i][j]=0;
                }
                else
                {
                    result[i][j]=array[i][j];
                }
            }
        }
        System.out.println("The Upper Triangular Matrix is: ");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {

                System.out.print(result[i][j]);
                System.out.print(" ");

            }
            System.out.println();

        }
    }
}
