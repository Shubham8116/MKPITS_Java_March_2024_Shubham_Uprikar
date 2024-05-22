package data;

import java.util.Scanner;

public class Cylinder extends Shape{
    @Override
    public void calculateVolume() {
        System.out.println("Enter the value of height");
        Scanner scanner=new Scanner(System.in);
        int height=scanner.nextInt();
        System.out.println("Enter the value of radius");
        int radius = scanner.nextInt();
        System.out.println("The volume of cylinder is "+(3.14*radius*radius*height));

    }
}
