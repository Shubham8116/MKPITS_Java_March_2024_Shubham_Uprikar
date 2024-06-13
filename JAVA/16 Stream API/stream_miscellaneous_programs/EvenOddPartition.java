//**Partition a list of integers into even and odd.**
package stream_practice_programs;

import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddPartition {
    public static void main(String[] args) {
        //creating List of Integers
        List<Integer> list= new ArrayList();
        for (int i = 0; i <100 ; i++) {
            list.add(i);

        }
        //partitionning a List using partitioningBy method of Collectors by providing even number expression
        Map<Boolean,List<Integer>> result=list.stream().collect(Collectors.partitioningBy(n->n%2==0));
        //printing even and odd numbers using forEach method
        result.forEach((m,n)-> System.out.println(n));
    }
}
