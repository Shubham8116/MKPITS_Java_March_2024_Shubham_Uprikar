package delete_file;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileDelete  fileDelete =new FileDelete();
        System.out.println("Enter file name to delete");
        Scanner  scanner=new Scanner(System.in);
        String filename=scanner.next();
        fileDelete.delete(filename);

    }
}
