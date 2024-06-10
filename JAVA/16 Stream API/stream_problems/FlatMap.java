//FlatMap:
//Create a list of lists of integers and use a stream to flatten the structure (i.e., merge all the lists into one) and then calculate the sum of all the integers.
package stream_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        //creating List of List of type Integer
        List<List<Integer>> list=new ArrayList<>();
        list.add(Arrays.asList(34,13,67));
        list.add(Arrays.asList(100,2,6));
        list.add(Arrays.asList(200,46,80));
        list.add(Arrays.asList(500,30,1));
        System.out.println("The list before flattening is : "+list);
        //flattening the List using flatMap method
         List a=  list.stream().flatMap(List::stream).collect(Collectors.toList());
          System.out.println(a);
    }
}
