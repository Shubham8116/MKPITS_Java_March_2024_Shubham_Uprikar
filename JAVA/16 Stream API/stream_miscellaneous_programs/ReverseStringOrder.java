//**Reverse the order of a list of strings.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringOrder {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        // 1) creating range between 0 to size of list
        // 2) mapping each position in range to -7,-6,-5,-4 etc.
        // 3) mapping each position to list items by providing above index using get() method of List
        // 4) collecting items using Collectors.

        List result= IntStream.range(0, list.size()).map(n-> list.size()-1-n).mapToObj(list::get).collect(Collectors.toList());
        System.out.println(result);

    }
}