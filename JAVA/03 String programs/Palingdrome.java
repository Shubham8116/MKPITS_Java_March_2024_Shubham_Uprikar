//Write a Java program to check if a given string is a palindrome or not.
//The program should take a string input from the user and output whether the string is a palindrome or not.
package methods;

import java.util.Scanner;

public class Palingdrome {
    public void chkpalindrome(String name){

        String reverse="";
        for (int i=name.length()-1;i>=0;i--) {
            char s = name.charAt(i);
            reverse += s;
        }
        System.out.println(name);
        System.out.println(reverse);
        
        System.out.println(reverse.equals(name)?"the number is palindrome":"the number is not palindrome");
        
    }

}
