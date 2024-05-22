//Java Program to Find Transpose of a Matrix .

import java.util.Scanner;

public class TransposeOfMatrix {
    public void transpose()
    {
        int array[][]=new int[3][3];
        int result[][]=new int[3][3];
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
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                result[j][i]=array[i][j];
            }


        }
        System.out.println("The transpose of matrix is :");
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
