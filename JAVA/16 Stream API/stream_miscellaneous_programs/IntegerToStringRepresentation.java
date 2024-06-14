// **Convert a list of integers to a list of their string representations.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;

public class IntegerToStringRepresentation {
    public static void main(String[] args) {
        //creating List of Integers
        List<Integer> list= Arrays.asList(34,67,1,3,4,67,10,89,34,78,45);
        //mapping each element of List into String using toString method
        list.stream().map(n->n.toString()).forEach(System.out::println);
    }
}
