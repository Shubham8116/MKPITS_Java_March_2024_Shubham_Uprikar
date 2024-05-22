// class Circle will extend abstract class shape and implement its methods.
package data;

import java.util.Scanner;

public class Circle extends Shape {

    public void welcomeMessage()
    {
        System.out.println("Hello, Welcome to Circle area and perimeter calculator");
    }
    public void  areaCalculate()
    {
        System.out.println("Enter the value of radius");
        Scanner scanner=new Scanner(System.in);
        int r= scanner.nextInt();;
        System.out.println("The area is "+(3.14*r*r));
    }
    public void perimeterCalculate()
    {
        System.out.println("Enter the value of radius");
        Scanner scanner=new Scanner(System.in);
        int r= scanner.nextInt();;
        System.out.println("The perimeter is "+(2*3.14*r));

    }
}
