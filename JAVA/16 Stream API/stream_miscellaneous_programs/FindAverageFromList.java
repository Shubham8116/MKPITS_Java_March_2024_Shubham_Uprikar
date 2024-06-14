//**Find the average of a list of integers.
package stream_practice_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindAverageFromList {
    public static void main(String[] args) {
        //creating List of Integers
        List<Integer> list= new ArrayList();
        for (int i = 1; i <100 ; i++) {
            list.add(i);

        }
        //calculating average using averagingInt method
        double a=list.stream().collect(Collectors.averagingInt(n->n));
        //printing average
        System.out.println("The average is : "+a);
    }
}
