//**Sort a list of strings by their lengths.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListByStringLength {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        //sorting list according to String length by passing length method reference in the comparing method of the Comparator
        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);


    }
}
