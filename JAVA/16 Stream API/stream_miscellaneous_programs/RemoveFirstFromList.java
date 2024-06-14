//**Remove the first element from a list using streams.**
package stream_practice_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveFirstFromList {
    public static void main(String[] args) {
        //creating List of Integers
        List<Integer> list= Arrays.asList(34,67,1,3,4,67,10,89,34,78,45);
        //removing first element from List using skip() method
        list.stream().skip(1).forEach(System.out::println);

    }
}
