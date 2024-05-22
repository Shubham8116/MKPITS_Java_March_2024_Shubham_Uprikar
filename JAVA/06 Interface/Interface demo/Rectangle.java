package data;

import java.util.Scanner;

public class Rectangle extends Shape{
    public void welcomeMessage()
    {
        System.out.println("Hello, Welcome to Rectangle area and perimeter calculator");
    }
    public void areaCalculate()
    {
        System.out.println("Enter the value of length");
        Scanner scanner=new Scanner(System.in);
        int length= scanner.nextInt();
        System.out.println("Enter the value of breadth");
        int breadth= scanner.nextInt();;
        System.out.println("The area is "+(length*breadth));
    }

    public void perimeterCalculate()
    {
        System.out.println("Enter the value of length");
        Scanner scanner=new Scanner(System.in);
        int length= scanner.nextInt();
        System.out.println("Enter the value of breadth");
        int breadth= scanner.nextInt();
        System.out.println("The perimeter is: "+(2*(length+breadth)));
    }
}
