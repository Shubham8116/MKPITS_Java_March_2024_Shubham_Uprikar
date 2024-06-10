//Using Predicates:
//Create a list of integers and use a stream to filter out numbers greater than 10 using a custom predicate.
package stream_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomPredicate {
    public static void main(String[] args) {
        //creating List of type integer
        List<Integer> list= Arrays.asList(34,67,1,30,45,68,10,100);
        //filtering numbers which are greater than 10 using filter method
        list.stream().filter(n->n>10).forEach(System.out::println);

    }
}
