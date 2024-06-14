//**Find the frequency of each string in a list.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfString {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","neha","priya","reshma","shabnam","max","shubham");
        //using counting method of Collectors to count the frequency of Strings and using forEach method to print the String and its frequency
        list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).forEach((str,freq)-> System.out.println("The String is : "+str+" And The frequency is : "+freq));
    }
}
