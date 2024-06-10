// Mapping:
//Create a list of integers and use a stream to double each integer in the list.
package stream_problems;

import java.util.*;

public class Mapping {
    public static void main(String[] args) {
        //creating fixed sized list of type Integer
        List<Integer> list= Arrays.asList(56,34,89,1,3,4,5,6,7,8,9,0);
        //performing integer double operation using map method
        list.stream().map(n->n+n).forEach(System.out::println);
    }
}
