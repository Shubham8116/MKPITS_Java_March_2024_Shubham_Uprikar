//Parallel Stream:
//Modify one of the previous assignments to use a parallel stream and compare the performance with the sequential stream.
package stream_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {
    public static void main(String[] args) {
        //creating first List with some values
        List<Integer> list=new ArrayList();
        for (int i = 0; i < 10000; i++) {

            list.add(i);
        }
        long start=System.currentTimeMillis();
        list.stream().map(n->n+n);
        long end=System.currentTimeMillis();
        //printing operation execution time
        System.out.println("The time for Stream operation is : "+(end-start));
        //creating second List with some values
        List<Integer> list1=new ArrayList();
        for (int i = 0; i < 10000; i++) {

            list1.add(i);
        }
        start=System.currentTimeMillis();
        list1.parallelStream().map(n->n+n);
        end=System.currentTimeMillis();
        //printing operation execution time
        System.out.println("The time for parallelStream operation is : "+(end-start));

    }
}
