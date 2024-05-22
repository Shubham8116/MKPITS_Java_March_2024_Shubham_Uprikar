package FileEncryption;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //calling encrypt function.
        System.out.println("Enter the file name to encrypt it");
        Scanner scanner=new Scanner(System.in);
        String source=scanner.next();
        System.out.println("Enter the file name to save encrypted text");
        String dest= scanner.next();;
        EncryptDycryptFile.encrypt(source,dest);

        // calling decrypt function.
        System.out.println("Enter the file name to decrypt it");
        Scanner scanner1=new Scanner(System.in);
        String source1=scanner.next();
        System.out.println("Enter the file name to save decrypted text");
       String dest1= scanner.next();;

        EncryptDycryptFile.dycrypt(source1,dest1);

    }
}
