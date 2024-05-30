//**Expression Converter (Infix to Postfix)**: Create a Java program that converts an infix expression to a postfix expression using the Stack class. The program should handle operators like +, -, *, /, and parentheses.
package stack_program;

import java.util.Stack;

public class InfixToPostfixConverter {

    // Function to return precedence of operators
    static int setPrecedence(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

    // Function to return associativity of operators
    static char associativity(char c) {
        if (c == '^')
            return 'r';
        return 'l'; // Default to left-associative
    }

    // The main function to convert infix expression to postfix expression
    static void infixToPostfix(String input) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // If character is an operand, add it to the output string.
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                result.append(c);
            }
            // If character is an ‘(‘, push it to the stack.
            else if (c == '(') {
                stack.push(c);
            }
            // If character is an ‘)’, pop and add to the output string from the stack until an ‘(‘ is encountered.
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Pop '('
            }
            // If an operator is scanned
            else {
                while (!stack.isEmpty() && (setPrecedence(input.charAt(i)) < setPrecedence(stack.peek()) || setPrecedence(input.charAt(i)) == setPrecedence(stack.peek()) && associativity(input.charAt(i)) == 'l'))
                {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the remaining elements from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        System.out.println(result);
    }


    public static void main(String[] args) {

        String input = "a+b*(c^d-e)^(f+g*h)-i";

        //  passing to method
        infixToPostfix(input);
    }
}
