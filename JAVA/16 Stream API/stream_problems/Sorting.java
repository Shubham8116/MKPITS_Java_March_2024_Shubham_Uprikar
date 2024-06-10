//Sorting:
//Create a list of strings and use a stream to sort them in ascending order.
package stream_problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("Shubham","Rahul","Akash","Ajay","Pooja","Hello");
        //sorting list using sorted() method
       List newlist= list.stream().sorted().collect(Collectors.toList());
        System.out.println(newlist);

    }

}
