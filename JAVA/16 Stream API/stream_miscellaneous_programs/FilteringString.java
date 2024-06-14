//**Filter out strings with length less than 5.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringString {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList(" shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        //filtering String having length less than 5 using filter method
        list.stream().filter(n->n.length()<5).forEach(System.out::println);
    }
}
