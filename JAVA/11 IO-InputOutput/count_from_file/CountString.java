//program to count occurances of the given word in the file.
package count_from_file;

import java.io.*;

public class CountString {
    public static void showCount(String filename,String search) throws IOException {
        System.out.println(search);

        int countword=0;
        File file=new File(filename) ;// creating File class object for the source file.
        if (file.exists())
        {
            // creating BufferedReader object to read from the file.
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String opearation[];
            String name=bufferedReader.readLine();
            while (name!=null)
            {
                opearation=name.split(" ");
                for (int i = 0; i < opearation.length ; i++)
                {
                    String a=opearation[i];
                    if(a.contains(search)) //will match words with given word.
                    {
                        countword++; // counting occurances.


                    }
                }
                name= bufferedReader.readLine();
            }
            System.out.println("Total count of words are : "+countword);
        }


    }
}
