//**Find the maximum number in a list of integers.
package stream_practice_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MaxNumberFromList {
    public static void main(String[] args) {
        //creating List of Integers
        List<Integer> list= new ArrayList();
        for (int i = 0; i <100 ; i++) {
            list.add(i);

        }
        //finding maximum number using max method
      OptionalInt a= list.stream().mapToInt(n->n).max();
        System.out.println(a.getAsInt());//converting from OptionalInt to int;
        OptionalInt b= list.stream().mapToInt(n->n).min();
        System.out.println(b.getAsInt());

    }

}
