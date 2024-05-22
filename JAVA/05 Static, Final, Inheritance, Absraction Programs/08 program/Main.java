//Final Method Usage: Create a final class "Calculator" with a final method "add" for adding two numbers.
//Demonstrate how to use this class and method in a Java program.i
mport data.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the value of 1st number");
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("Enter the value of 2nd number");
        int b= s.nextInt();
        Calculator  calculator=new Calculator();
        calculator.add(a,b);
    }

}
