package data;

import java.util.Scanner;

public class Sphere extends Shape{
    @Override
   public void calculateVolume() {
        System.out.println("Enter the radius of sphere");
        Scanner scanner=new Scanner(System.in);
        int r= scanner.nextInt();

        System.out.println("The volume is: "+(4/3*3.14*r*r*r));
    }
}
