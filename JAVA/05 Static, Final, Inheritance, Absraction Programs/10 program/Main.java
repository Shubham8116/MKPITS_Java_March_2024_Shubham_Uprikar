//Final Class Example: Design a final class "MathConstants" containing final fields for mathematical constants like PI and E.
//Demonstrate how to use these constants in a Java program.
import data.MathConstants;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            System.out.println("Enter the radius of circle to calculate area ");
            Scanner  scanner=new Scanner(System.in);
            int r=scanner.nextInt();
            double result= MathConstants.pi*r*r;
            System.out.println("The area is :"+result);


    }
}
