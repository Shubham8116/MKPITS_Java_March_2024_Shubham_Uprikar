//**Sort a list of strings alphabetically.
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortString {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        //sorting list using sorted() method
       list.stream().sorted().forEach(System.out::println);

    }
}
