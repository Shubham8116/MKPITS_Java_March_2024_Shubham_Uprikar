//**Convert a list of integers to a list of their squares.**
package stream_practice_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntegerToSquare {
    public static void main(String[] args) {
        //creating List of Integers
        List<Integer> list= new ArrayList();
        for (int i = 0; i <100 ; i++) {
            list.add(i);

        }
        //mapping list items to their squares
        list.stream().map(n->n*n).forEach(System.out::println);

    }
}
