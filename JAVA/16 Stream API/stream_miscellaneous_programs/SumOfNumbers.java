// program to calculate sum of numbers
package stream_practice_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class SumOfNumbers {
    public static void main(String[] args) {
        //creating List of Integers
        List<Integer> list= new ArrayList();
        for (int i = 1; i <=100 ; i++) {
            list.add(i);

        }
        int a=list.stream().mapToInt(n->n).sum();
        System.out.println(a);
    }
}
