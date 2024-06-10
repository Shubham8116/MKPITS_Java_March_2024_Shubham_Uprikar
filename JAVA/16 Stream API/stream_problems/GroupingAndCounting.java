//Grouping and Counting:
//Create a list of strings and use a stream to group them by their length, and then count the number of strings in each group.
package stream_problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndCounting {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Shubham","Rahul","Akash","Ajay","Pooja","Hello","rani","paro");
        Map<Integer,Long> map=list.stream().collect(Collectors.groupingBy(n->n.length(),Collectors.counting()));
        System.out.println(map);
        map.forEach((len,count)-> System.out.println("The length of String is : "+len+" The count is : "+count));

    }
}
