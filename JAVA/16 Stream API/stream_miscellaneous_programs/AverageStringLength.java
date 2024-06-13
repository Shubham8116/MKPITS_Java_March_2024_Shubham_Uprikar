//**Calculate the average length of strings in a list.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageStringLength {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        //finding average of String length using averagingInt method of Collectors
        double result=list.stream().map(n->n.length()).collect(Collectors.averagingInt(n->n));
        //converting double to int and printing the result
        System.out.println("The average length of the strings is : "+((int)result));

    }
}
