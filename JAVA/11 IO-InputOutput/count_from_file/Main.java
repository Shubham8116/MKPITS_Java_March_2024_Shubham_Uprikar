

package count_from_file;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the filename");
        String filename=scanner.next();
        System.out.println("Enter the word to search");
        String search=scanner.next();
        //CountInFile.countLinesWordsCharacters(filename);
        CountString.showCount(filename,search);
    }
}
