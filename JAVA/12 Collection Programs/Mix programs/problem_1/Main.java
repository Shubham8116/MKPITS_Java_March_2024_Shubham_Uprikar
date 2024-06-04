//### Problem 1: Unique Words Counter
//**Objective:** Implement a program that reads a large text file and counts the number of unique words.
//
//**Requirements:**
//- Use `HashSet` to store and ensure the uniqueness of words.
//- Read the file line by line, split each line into words, and add them to the `HashSet`.
//- Output the total count of unique words found in the text.
package problem_1;

import problem_1.data.ReadFromFile;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {
        //providing file name
        String filename="abc.txt";
        //calling method that will read from the file
        ReadFromFile   readFromFile=new ReadFromFile();
        readFromFile.readFromFile(filename);

    }
}
