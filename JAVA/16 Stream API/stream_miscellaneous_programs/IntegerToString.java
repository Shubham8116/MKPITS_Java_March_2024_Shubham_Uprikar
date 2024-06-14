//**Create a comma-separated string from a list of integers.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class IntegerToString {
    public static void main(String[] args) {
        //creating list of positive and negative numbers
        List<Integer> list= Arrays.asList(34,78,1,3,-8,-5,9,0,1,4,-67,-45,90);
        //1) mapping Integers to String using toString method
        //2) joining Strings using joining method of Collectors
        System.out.println(list.stream().map(Objects::toString).collect(Collectors.joining(",")));
    }
}
