//program to demonstrate File class in Java.
package io_demo_programs;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file =new File("shubham"); // creating File class object and passing filename to it.
        System.out.println(file.exists());//will return true because file is in the same project
        System.out.println(file.canRead());//will return true
        System.out.println(file.getAbsoluteFile());//will return file path
        System.out.println(file.delete());//will delete file
        System.out.println(file.getParent());
        File path=new File("F:\\filedemo");
        File file2=new File(path,"shubham.txt");
        System.out.println(file2.exists());////will return true because file is available
        //file2.delete();
        String[] name=path.list();
        for (String s:name)
           System.out.println(s); // will print list of files
        System.out.println(file2.length());//will print length of the file-characters legth including sapce.
        File file3=new File("F:\\filedemo\\hello");
        file3.mkdir();
    }
}
