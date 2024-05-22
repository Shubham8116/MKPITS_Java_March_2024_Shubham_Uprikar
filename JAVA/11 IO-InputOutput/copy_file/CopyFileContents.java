//program to copy file contents and save in another file.
package copy_file;

import java.io.*;

public class CopyFileContents {
    public static void copyData(String source, String dest) throws IOException {
        File sourceFile = new File(source);// creating File object for source file.
        File destFile = new File(dest);// creating File object for destination file.
        if (sourceFile.exists()) { // checking if file exists or not.

           //creating BufferedWriter for writing in the file.
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(destFile,true));
            //creating BufferedReader for reading from the file.
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
            String name=bufferedReader.readLine();// reading first line.
            while(name!=null)
            {
                bufferedWriter.newLine();
                bufferedWriter.write(name);// writing in the destination file.
                System.out.println("data is writed");
                name=bufferedReader.readLine();// copying next line from source
               // bufferedWriter.flush();

            }
                bufferedWriter.close();// closing BufferedWriter.
            bufferedReader.close();//closing BufferedReader.
        }
        else {
            System.out.println("files are not found");
        }
    }
}
