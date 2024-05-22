//program to demonstrate BufferedReader and InputStreamReader.
package io_demo_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader a=new InputStreamReader(System.in);//creating object of bytestream
        BufferedReader bufferedReader=new BufferedReader(a);//converting bytestream to character stream
        String name=bufferedReader.readLine();//reading from user.
        System.out.println(name);
    }
}
