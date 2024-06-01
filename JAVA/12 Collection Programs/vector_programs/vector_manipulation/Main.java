//Vector Manipulation: Create a Java program that manipulates two vectors, performing operations like vector addition, subtraction, scalar multiplication, and dot product calculation using the Vector class.
package vector_programs.vector_manipulation;

import vector_programs.vector_manipulation.data.VectorManipulation;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        VectorManipulation vectorManipulation=new VectorManipulation();
        //creating two Vector class and adding numbers in it
        Vector vector1=new Vector();
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);
        vector1.add(6);
        Vector  vector2=new Vector();
        vector2.add(2);
        vector2.add(1);
        vector2.add(8);
        vector2.add(7);
        System.out.println("Vector 1 is : "+vector1);
        System.out.println("Vector 2 is : "+vector2);
        //performing addition on vectors
        System.out.println("The addition is : ");
        vectorManipulation.addition(vector1,vector2);
        //performing subtraction on vectors
        System.out.println("The subtraction is : ");
        vectorManipulation.subtraction(vector1,vector2);
        //performing scaler multiplication on vectors
        System.out.println("The scaler multiplication for vector 1 is : ");
        vectorManipulation.scalerMultiplication(vector1);
        System.out.println("The scaler multiplication for vector 2 is : ");
        vectorManipulation.scalerMultiplication(vector2);
        //performing dot product on vectors
        System.out.println("The dot product is : ");
        vectorManipulation.dotProduct(vector1,vector2);
    }
}
