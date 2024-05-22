package copy_file;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner  scanner=new Scanner(System.in);
        String source,dest,answer;
        System.out.println("Enter the path and name of source file , example : c:\\filedemo\\name.txt");
        source=scanner.next();
        System.out.println("Enter the name of the destination file ,  , example : c:\\filedemo\\name.txt");
        dest=scanner.next();
        System.out.println("do you want to copy and paste data, Enter y/n");
        answer=scanner.next();
        if (answer.equalsIgnoreCase("y"))
        {
            CopyFileContents.copyData(source,dest);
        }
        else
        {
            System.out.println("Thank you !");
        }


    }
}
