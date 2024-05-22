//2. Temperature Converter: Develop a program that converts temperatures between Celsius and Fahrenheit scales, allowing users to input a temperature in one scale and see the converted temperature in the other scale.
import temp.Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter converter=new Converter();
        System.out.println("======  Welcome to temperature converter  =======");
        System.out.println("Press 1. To convert celsius to fahrenheit");
        System.out.println("Press 1. To convert fahrenheit to celsius");
        Scanner scanner=new Scanner(System.in);
        int choice= scanner.nextInt();
        if(choice==1)
        {
            System.out.println("Enter celsius value");
            int a = scanner.nextInt();
            converter.setCelsius(a);
            converter.celsiusToFahrenheit();

        }
        else if(choice==2) {
            System.out.println("Enter fahrenheit value");
            int a = scanner.nextInt();
            converter.setFahrenheit(a);
            converter.fahrenheitToCelsius();

        }
        else {
            System.out.println("Enter correct choice");
        }


    }
}