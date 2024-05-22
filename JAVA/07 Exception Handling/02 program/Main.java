//Main class to call MatchString class.
import data.MatchString;
import data.StringMismatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 1st Strings");
        Scanner sc=new Scanner(System.in);
        String name1=sc.next();
        System.out.println("Enter 2nd Strings");
        String name2= sc.next();
        MatchString m=new MatchString();
        try {
            m.result(name1, name2);
        }
        //catch block will catch exception .
        catch (StringMismatch e)
        {
            //printing message which we passed to the exception class from user defined exception.
            System.out.println(e);
        }
    }
}
