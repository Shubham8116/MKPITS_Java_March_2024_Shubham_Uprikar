//**Get a list of unique numbers from a list with duplicates.
package stream_practice_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        //creating List of Integers
        List<Integer> list= Arrays.asList(34,67,1,3,4,5,6,13,45,67,89,13,45,4,2);
        //removing duplicates using distinct() method
        list.stream().distinct().forEach(System.out::println);
    }
}
