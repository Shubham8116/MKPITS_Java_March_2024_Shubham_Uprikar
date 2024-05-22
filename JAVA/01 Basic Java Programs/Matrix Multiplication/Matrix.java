//Write a Java program to multiply two matrices of size m×n and n×p.
//The program should take the dimensions and elements of the two matrices as input from the user and output the resulting matrix after multiplication.
//The time complexity of matrix multiplication is O(mnp), where m, n, and p are the dimensions of the matrices.
//This is because we have three nested loops iterating over the rows and columns of the matrices.
//The space complexity is O(mn) for the result matrix, as it has the same dimensions as the input matrices.

public class Matrix {

    public void matrixMultiplication() {
        int matrix1[][] = {{1, 4, 5}, {3,6 , 2}, {9, 3, 4}};
        int matrix2[][] = {{2, 4, 8}, {3, 4, 2}, {7, 1, 3}};


        int result[][] = new int[3][3];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++)
                {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }

            }

        }

        for (int i=0;i<3;i++)
        {
            System.out.print("|");
            for(int j=0;j<3;j++)
            {
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println("");
        }


    }
}
