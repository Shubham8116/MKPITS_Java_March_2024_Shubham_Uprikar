package stack_program;

import java.util.Scanner;
import java.util.Stack;

public class BalancedSymbolCheck {

        public void checkString(String input)
        {
            int brackets=0,paranthasis=0,braces=0;
            String value;
            //creating Stack of type Character
            Stack<Character> stack=new Stack();
            //storing string characters in the Vector
            for (int i = 0; i <input.length() ; i++) {
                System.out.println(input.charAt(i));
                stack.push(input.charAt(i));
            }
            System.out.println("The stack after adding String is: "+stack);

            for (int i = 0; i <input.length() ; i++) {
                System.out.println("poping and checking");
                value=(stack.peek()).toString();
                System.out.println(value);
                stack.pop();
                if (value.equals("(")||value.equals(")"))
                    paranthasis++;
                else if (value.equals("{")||value.equals("}"))
                    braces++;
                else if (value.equals("[")||value.equals("]"))
                    brackets++;

            }
            if (braces%2!=0||brackets%2!=0||paranthasis%2!=0)
            {
                if (braces % 2 != 0) {
                    System.out.println("Braces are not matched");
                }
                if (brackets % 2 != 0) {
                    System.out.println("Brackets are not matched");
                }
                if (paranthasis % 2 != 0) {
                    System.out.println("Paranthasis are not matched");
                }
            }
            else
                System.out.println("All are balanced");


        }



        public static void main(String[] args) {
            System.out.println("Enter String to check parentheses, brackets, and braces are balanced or not");
            Scanner scanner=new Scanner(System.in);
            String input= scanner.next();
            BalancedSymbolCheck check=new BalancedSymbolCheck();
            check.checkString(input);
        }
    }

