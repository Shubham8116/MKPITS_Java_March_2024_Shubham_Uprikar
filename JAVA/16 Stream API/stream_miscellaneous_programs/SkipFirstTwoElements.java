//**Skip the first 2 elements in a list.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;

public class SkipFirstTwoElements {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        //skipping first 2 elements in the list
        list.stream().skip(2).forEach(System.out::println);
    }
}
