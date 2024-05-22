// Menu driven program for various opearations on numbers.
import java.util.Scanner;
import Methods.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(" Choose form the options");
        System.out.println("1. check for prime number");
        System.out.println("2. check for perfect number");
        System.out.println("3. check for armstrong number");
        System.out.println("4. check for palingdrome number");
        System.out.println("5. check for even odd number");
        System.out.println("6. print factorial of number");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {

            case 1:
                Numbers.chkPrime();
                break;

            case 2:
                Numbers.chkPerfect();
                break;

            case 3:
                Numbers.chkArmstrong();
                break;

            case 4:
                Numbers.chkPalingdrome();
                break;

            case 5:
                Numbers.chkEvenOdd();
                break;


            case 6:
                Numbers.chkFactorial();
                break;


            default:
                System.out.println("enter valid number");


        }




    }
}