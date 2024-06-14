//**Find the second highest number in a list of integers.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestFromList {
    public static void main(String[] args) {
        //creating List of Integers
        List<Integer> list= Arrays.asList(34,67,1,3,4,67,10,89,34,78,45);
        //1) sorting stream by comparator in descending order
        //2) skipping first element then
        //3) finding first element
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

    }
}
