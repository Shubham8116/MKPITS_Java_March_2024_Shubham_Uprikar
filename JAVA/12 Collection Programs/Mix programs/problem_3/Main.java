//### Problem 3: Sorted Unique Elements
//**Objective:** Develop a program that takes a list of integers from user input, removes duplicates, and sorts the remaining elements.
//
//**Requirements:**
//- Use `TreeSet` to store the integers in a sorted and unique manner.
//- Allow the user to input a list of integers (possibly with duplicates).
//- Print the elements of the `TreeSet` in ascending order.
package problem_3;

import problem_3.data.StoreAndReadIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StoreAndReadIntegers storeReadIntegers=new StoreAndReadIntegers();
        int value;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 10 numbers :") ;
        for (int i = 0; i < 10; i++) {
            value= scanner.nextInt();
            storeReadIntegers.storeNumbers(value);
        }

        storeReadIntegers.printNumbers();

    }
}
