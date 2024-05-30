package stack_program;
import java.util.*;

public class PostFixExpressionEvaluator {
    static int evaluate(String input)
    {
        // Create a stack
        Stack stack = new Stack();

        // Scan all characters one by one
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // If the scanned character is an operand push it to the stack.
            if (Character.isDigit(c))
                stack.push(c);

                //  If the scanned character is an operator, pop two elements from stack apply the operator
            else {
                int val1 = Integer.parseInt(stack.pop().toString());
                int val2 = Integer.parseInt(stack.pop().toString());

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return Integer.parseInt(stack.pop().toString());
    }

    public static void main(String[] args)
    {
        String input = "231*+9-";

        // Function call
        System.out.println("postfix evaluation is : "
                + evaluate(input));
    }
}
