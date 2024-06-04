// Problem 5: Case-Insensitive Word Storage
//**Objective:** Write a program that stores words in a case-insensitive manner, ensuring no duplicates regardless of case, and then retrieves the words in a case-insensitive sorted order.

//**Requirements:**
// - Use `TreeSet` with a custom comparator that ignores case for sorting and uniqueness.
//- Allow the user to input a series of words (case-insensitive)-
// Add words to the `TreeSet` and then print the words in alphabetical order, ignoring case.

package problem_5;

import problem_5.data.StoreWords;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter words separated by space");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();//taking input from user
        StoreWords storeWords=new StoreWords();
        storeWords.store(name);//calling method

    }
}
