/*Problem 7: Word Frequency Counter
**Objective:** Count the frequency of each word in a large text file.

**Requirements:**
        - Use `Hashtable` to store words as keys and their frequencies as values.
        - Read the file line by line, split each line into words, and update the frequencies.
- Output the frequency of each word.*/
package problem_7;

import problem_7.data.FrequencyCounter;

import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        String filename="abc.txt";//taking filename
        FrequencyCounter frequencyCounter=new FrequencyCounter();
        frequencyCounter.count(filename);//calling method
    }
}
