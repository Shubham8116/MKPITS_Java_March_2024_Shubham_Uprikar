//program to count the no. of line, words, characters from a given file.
package count_from_file;

import java.io.*;

public class CountInFile {
    public  static void countLinesWordsCharacters(String filename) throws IOException {
        File file = new File(filename);// creating File object for the source file.
        int lines=0,words=0,characters=0;
        if (file.exists()) {  //this will check if file exists or not.
            // creating BufferedReader object to read from the file.
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String operation[];
            String name=bufferedReader.readLine();
            while(name!=null)
            {
                operation=name.split(" "); //splitting line to the total words in string array.
                for (int i = 0; i <operation.length ; i++)
                {
                    words++;// counting words.
                    for (int j = 0; j <operation[i].length() ; j++) // taking each words using index number.
                    {
                        characters++;// counting characters of each words.
                    }

                }
                lines++; // counting lines in the file.
                name=bufferedReader.readLine();// taking next line from the file.
            }
            System.out.println("The lines are: "+lines);
            System.out.println("The words are: "+words);
            System.out.println("The characters are: "+characters);

        }
        else
        {
            System.out.println("File not found");
        }

    }
}
