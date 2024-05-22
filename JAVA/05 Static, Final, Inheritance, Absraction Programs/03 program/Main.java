//Final Constructor Example: Create a final class "ImmutablePoint" representing a point in 2D space with final fields for x and y coordinates.
//Ensure that the class has a constructor to initialize these coordinates, but once initialized, they cannot be modified.
import data.ImmutablePoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the x coordinate value");
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        System.out.println("Enter the y coordinate value");
        int y= scanner.nextInt();
        ImmutablePoint immutablePoint=new ImmutablePoint(x,y);
        System.out.println("The x coordinate is : "+immutablePoint.getX_coordinate());
        System.out.println("The y coordinate is : "+immutablePoint.getY_coordinate());
    }
}
