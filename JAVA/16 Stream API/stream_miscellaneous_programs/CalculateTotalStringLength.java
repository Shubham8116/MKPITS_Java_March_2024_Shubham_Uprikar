//**Calculate the total length of all strings in the list.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;

public class CalculateTotalStringLength {
    public static void main(String[] args) {//creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        //calculating total length of all Strings by sum() method
        System.out.println(list.stream().map(n->n.length()).mapToInt(n->n).sum());


    }
}
