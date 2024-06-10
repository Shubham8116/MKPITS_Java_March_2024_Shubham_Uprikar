// Filtering and Collecting:
//Create a list of strings and use a stream to filter out strings that start with the letter "A". Collect the filtered strings into a new list.
package stream_problems;

import java.util.*;
import java.util.stream.Collectors;

public class FilteringAndCollecting {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("Shubham","Rahul","Akash","Ajay","Pooja");
        //filtering Strings using filter method and collecting them using collect method
        List newlist=list.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
        System.out.println(newlist);
    }
}
