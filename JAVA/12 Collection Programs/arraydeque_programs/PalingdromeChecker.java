//**Palindrome Checker**: Develop a Java program that checks whether a given string is a palindrome or not using the ArrayDeque class. Utilize the deque data structure to efficiently compare characters from both ends of the string.
package arraydeque_programs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PalingdromeChecker {
    public static void check(String name)
    {
        //creating ArrayDeque of Character
        ArrayDeque<Character> arrayDeque=new ArrayDeque();
        StringBuffer stringBuffer=new StringBuffer("");
        for (int i =name.length()-1; i>=0; i--)
        {
         arrayDeque.add(name.charAt(i));
        }
        //traversing through ArrayDeque
        for (char a:arrayDeque)
        {
            //appending each characters into the StringBuffer
            stringBuffer.append(a);
        }
        System.out.println(stringBuffer);

        if (stringBuffer.toString().equalsIgnoreCase(name))//checking for palingdrome
            System.out.println("It is palingdrome");
        else
            System.out.println("It is not palingdrome");
    }
    public static void main(String[] args) {
        System.out.println("Enter string to check for palingdrome");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.next();
        PalingdromeChecker.check(name);
    }
}
