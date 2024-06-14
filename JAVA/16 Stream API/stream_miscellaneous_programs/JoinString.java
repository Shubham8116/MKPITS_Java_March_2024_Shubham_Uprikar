//**Join a list of strings with a custom separator.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        //using joining method of Collectors to join the strings
        System.out.println(list.stream().collect(Collectors.joining(" " )));
    }
}
