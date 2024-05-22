package data;

import java.util.Scanner;

public class Cube extends Shape {
    @Override
   public void calculateVolume() {
        System.out.println("Enter the value of edge");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("The volume of cube is :"+(a*a*a));

    }
}
