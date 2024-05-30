//**Reverse String using Stack**: Develop a Java program that reverses a given string using the Stack class. The program should push each character onto the stack and then pop them off to construct the reversed string.
package stack_program;

import java.util.Stack;

public class ReverseString {
    public void reverse(String input)
    {
        //creating Stack of type character
        Stack<Character>  stack=new Stack();
        for (int i = 0; i <input.length() ; i++) {
            stack.push(input.charAt(i));

        }
        //poping elements from stack and generating reverse String
        for (int i = 0; i <input.length() ; i++) {
            System.out.print(stack.pop());

        }

    }
    public static void main(String[] args) {
        ReverseString reverseString=new ReverseString();
        reverseString.reverse("shubham");


    }
}
