// Develop a static utility class "StringUtils" with static methods for common string operations like reversing a string, counting occurrences of a substring, and converting a string to uppercase.
import data.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 1. to reverse string 2. to convert string to uppercase 3. to count substring in a given string");
        Scanner scanner=new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter the string");
                String name= scanner.next();
                StringUtils.reverseString(name);
                break;

            case 2:
                System.out.println("Enter the string");
                String name1= scanner.next();
                StringUtils.toUppercase(name1);
                break;

            case 3:

                System.out.println("Enter the string");
                Scanner scanner1=new Scanner(System.in);
                String name2=scanner1.nextLine();
                System.out.println("Enter the substring");
                Scanner scanner2=new Scanner(System.in);
                String name3=scanner2.next();
                StringUtils.countSubstring(name2,name3);
                break;

            default:
                System.out.println("Enter valid choice");
                break;

        }

    }
}
