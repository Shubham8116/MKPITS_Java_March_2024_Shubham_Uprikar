// program to demonstrate reading and writing in the file.
package io_demo_programs;

import java.io.*;

public class FileReadWrite {
    public static void writeToFile() {
        //creating BufferedReader object to Read from the keyboard.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter;

        try {
            String name, choice;
            //creating BufferedWriter object to write in the file.
            bufferedWriter = new BufferedWriter(new FileWriter("F:\\filedemo\\shubham.txt", true));
            do {
                System.out.println("Enter name");
                name = bufferedReader.readLine();// reading from keyboared.
                bufferedWriter.write(name);// writing in the file.
                System.out.println("data is writed");
                bufferedWriter.newLine();//to go to new line in the file
                System.out.println("Do you want to continue ?,Enter y/n");
                choice = bufferedReader.readLine();
            } while (choice.equalsIgnoreCase("y"));

            bufferedWriter.close();// to close the bufferedWriter

        } catch (IOException e) {

        }
    }

    //method to read from the file
    public static void readFromFile(String fname) throws IOException {
        File file = new File(fname);
        if (file.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fname));
            String name = bufferedReader.readLine();
            while (name != null) {
                if (name.contains("shubham"))
                    System.out.println(name);//printing lines which have "shubham" word.
                name = bufferedReader.readLine();
            }
        }
        else
        {
            System.out.println("File not found");
        }
    }
}
