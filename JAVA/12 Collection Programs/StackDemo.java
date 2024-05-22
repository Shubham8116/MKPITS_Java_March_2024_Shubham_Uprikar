//program to demonstrate Stack class in java .
import java.util.*;
public class StackDemo {

        public static void main(String[] args) {
            //creating Stack
            Stack<Integer> stack = new Stack<>();
            for (int i = 1; i < 6; i++) {
                stack.push(i);
            }
            System.out.println("The elements of the Stack class");
            System.out.println("Pop Operation:");
            for (int i = 0; i < 5; i++) {
                Integer y = stack.pop();
                System.out.println(y);
            }
            for (int i = 0; i < 5; i++) {
                stack.push(i);
            }
            Integer topElement = stack.peek();
            System.out.println("Element on stack top: " + topElement);
            int searchElement = 2;
            System.out.println("Position of element 2 is : "+stack.search(searchElement));

        }
    }