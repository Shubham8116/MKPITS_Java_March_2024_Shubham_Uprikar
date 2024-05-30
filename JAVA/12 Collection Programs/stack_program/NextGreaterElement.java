//**Next Greater Element**: Design a Java program that finds the next greater element for each element in a given array using the Stack class. The program should output an array where each element represents the next greater element to the right in the original array.
package stack_program;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
    public static void findGreater(int array[])
    {
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < array.length ; i++) {
            stack.push(array[i]);

        }
        Collections.sort(stack);
        for (int i = 0; i < stack.size()-1 ; i++)
        {
            System.out.println("The greater element for "+stack.get(i)+" is : "+stack.get(i+1));
        }


    }

    public static void main(String[] args) {
        int array[]=new int[10];
        array[0]=45;
        array[1]=36;
        array[2]=100;
        array[3]=1;
        array[4]=8;
        array[5]=90;
        array[6]=4;
        array[7]=600;
        array[8]=234;
        array[9]=1569;
        System.out.println("passsing array : "+Arrays.toString(array));

        NextGreaterElement.findGreater(array);
    }
}
