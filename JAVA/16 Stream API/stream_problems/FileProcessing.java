// File Processing:
//Read a text file line by line using the Files.lines() method and process each line using a stream.
package stream_problems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileProcessing {
    public static void main(String[] args) {
        //Storing path in String
        String file_path ="abc.txt";

        try {
            //Creating Stream object which read and store lines using Files.lines method
            Stream<String> lines= Files.lines(Paths.get(file_path));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
