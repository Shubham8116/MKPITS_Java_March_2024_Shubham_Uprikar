//**Filter out negative numbers from a list of integers.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        //creating list of positive and negative numbers
        List<Integer> list= Arrays.asList(34,78,1,3,-8,-5,9,0,1,4,-67,-45,90);
        //filtering out negative number and printing positive numbers
        list.stream().filter(n->n>=0).forEach(System.out::println);
    }
}
