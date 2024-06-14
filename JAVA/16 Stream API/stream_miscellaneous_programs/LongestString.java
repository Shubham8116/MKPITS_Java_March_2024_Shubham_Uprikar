//**Find the longest string in the list.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahulaaaa","max","shruti","neha","priya","reshma","shabnam");
       String newString = list.stream().max(Comparator.comparingInt(String::length)).orElse("null");
        System.out.println(newString);

    }
}
