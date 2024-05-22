//Final Variable Usage: Create a final class "Constants" with final variables for representing various physical constants like the speed of light, gravitational constant, and Planck's constant.
//Demonstrate how to access these constants in a Java program.
import data.Constants;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 1. speed of light 2. gravitational constant 3. plank's constant");
        Scanner  scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("The speed of light constant is "+ Constants.speed_of_light);
                break;
            case 2:
                System.out.println("The gravitational constant is "+ Constants.gravitational_constant);
                break;
            case 3:
                System.out.println("The plank's constant is "+ Constants.planks_constant);
                break;
            default:
                System.out.println("Enter valid choice");
        }
    }
}
