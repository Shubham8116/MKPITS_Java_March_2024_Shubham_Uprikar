//utility class Numbers to perform operations on numbers.
package Methods;

import java.util.Scanner;

public class Numbers {

    public static void chkPrime()
    {
        int num,flag=0;
        System.out.println("Enter number to check if it is prime or not");
        Scanner scanner=new Scanner(System.in);
        num= scanner.nextInt();
        if (num == 0 || num == 1)
            flag = 1;

        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag==0)
            System.out.println("It is prime number");

        else
            System.out.println("It is not prime number");

    }

    public static void chkPerfect()
    {

        int n,i=1, sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=scanner.nextInt();


        while(i <= n/2)
        {
            if(n % i == 0)
            {

                sum= sum + i;
            } //end of if

            i++;
        }

        if(sum==n)
        {

            System.out.println(n+" is a perfect number.");
        }
        else

            System.out.println(n+" is not a perfect number.");
    }

    public static void chkArmstrong()
    {
        System.out.println("Enter a number");
        int remainder,result=0;
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }


    public static void chkEvenOdd()
    {
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(number%2==0)
        {
            System.out.println("This number is even");
        }
        else {
            System.out.println("This number is odd");
        }
    }

    public static void chkPalingdrome()
    {
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int r,sum=0,temp;


        temp=num;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

    public static void chkFactorial()
    {
        System.out.println("Enter a number to calculate factorial");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int i,fact=1;

        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}






