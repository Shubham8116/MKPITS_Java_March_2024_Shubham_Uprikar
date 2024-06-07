//### Problem 15: Frequency of Characters in a String
//**Objective:** Count the frequency of each character in a given string.
//
//**Requirements:**
//- Use `HashMap` to store characters as keys and their frequencies as values.
//- Read the input string character by character and update the frequencies.
//- Output the frequency of each character.
package problem_15;

import problem_15.data.FrequencyOfCharecter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        FrequencyOfCharecter f=new FrequencyOfCharecter();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the String ");
        try {
            //readline method throw exception
            String str= reader.readLine();

            f.setInput_string(str);

            f.charecterFrequency();

            f.displayCharFreq();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
