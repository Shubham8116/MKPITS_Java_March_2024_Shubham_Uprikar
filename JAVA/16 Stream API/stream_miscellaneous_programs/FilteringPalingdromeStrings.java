//**Filter out strings that are palindromes.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;

public class FilteringPalingdromeStrings {
    public static void main(String[] args) {
//creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","ele","max","shruti","neha","priya","oyo","reshma","shabnam");
        //filtering out strings that are palingdrome using filter method
        list.stream().filter((n)->{ StringBuilder str=new StringBuilder(n);if(n.equals(String.valueOf(str.reverse()))) return true;else return false;}).forEach(System.out::println);
    }
}
