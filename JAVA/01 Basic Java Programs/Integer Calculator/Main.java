//1. Calculator Application: Create a simple calculator program that can perform basic arithmetic operations like addition, subtraction, multiplication, and division.

import methods.Calculate;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Calculate calculate=new Calculate();
        int a,b,choice=0;
        while(choice!=5)
        {
            System.out.println("==========================================================");
            System.out.println("Hello and welcome to Arithmatic Calculator!");
            System.out.println("press 1. Addition");
            System.out.println("press 2. Subtraction");
            System.out.println("press 3. Multiplication");
            System.out.println("press 4. Division");
            System.out.println("press 5. Exit");
            System.out.println("==========================================================");
            Scanner scanner=new Scanner(System.in);
            choice= scanner.nextInt();
            switch(choice)
            {
                case 1:

                    System.out.println("Enter the value of 1st number");
                    a=scanner.nextInt();
                    System.out.println("Enter the value of 2nd number");
                    b=scanner.nextInt();
                    System.out.println("The answer is : "+calculate.addition(a,b));
                    break;

                case 2:

                    System.out.println("Enter the value of 1st number");
                    a=scanner.nextInt();
                    System.out.println("Enter the value of 2nd number");
                    b=scanner.nextInt();
                    System.out.println("The answer is : "+calculate.subtraction(a,b));
                    break;

                case 3:

                    System.out.println("Enter the value of 1st number");
                    a=scanner.nextInt();
                    System.out.println("Enter the value of 2nd number");
                    b=scanner.nextInt();
                    System.out.println("The answer is : "+calculate.muiltiplication(a,b));
                    break;

                case 4:

                    System.out.println("Enter the value of 1st number");
                    a=scanner.nextInt();
                    System.out.println("Enter the value of 2nd number");
                    b=scanner.nextInt();
                    System.out.println("The answer is : "+calculate.division(a,b));
                    break;

                case 5:

                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct value");

            }
        }

    }
}