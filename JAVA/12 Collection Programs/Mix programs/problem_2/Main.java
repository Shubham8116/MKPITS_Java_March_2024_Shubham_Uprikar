//### Problem 2: Order of Insertion Preservation
//**Objective:** Create a program that reads a sequence of integers from user input and stores them in the order they were entered, ensuring no duplicates.
//
//**Requirements:**
//- Use `LinkedHashSet` to maintain the insertion order while storing unique integers.
//- Allow the user to input integers one by one and add them to the set.
//- Print the elements of the `LinkedHashSet` in the order they were entered.
package problem_2;

import problem_2.data.StoreReadIntegers;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StoreReadIntegers  storeReadIntegers=new StoreReadIntegers();
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
