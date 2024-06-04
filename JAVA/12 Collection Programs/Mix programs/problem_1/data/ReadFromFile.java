//this class will perform operation on the file using HashSet
package problem_1.data;
import java.io.*;
import java.util.*;

public class ReadFromFile {
    public void readFromFile(String filename) throws IOException {
        HashSet  hashSet=new HashSet();
        String content[];
        //creating file and BufferedReader object
        File file=new File(filename);
        if (file.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String output = bufferedReader.readLine();//reading file's each line
            while (output != null) {
                content = output.split(" ");
                for (int i = 0; i < content.length; i++) {
                    hashSet.add(content[i]);//storing words in the hashset
                }
                output = bufferedReader.readLine();
            }

            System.out.println("Contents are read from file and stored in hashset successfully !");
            System.out.println("printing hashset - remember that hashset does not follows insertion order");
            // looping over hashset and printing unique elements
            for (Object o:hashSet)
            {
                System.out.print(o);
                System.out.println(" ");
            }
        }
        else
            System.out.println("enter correct file name");
    }
}
