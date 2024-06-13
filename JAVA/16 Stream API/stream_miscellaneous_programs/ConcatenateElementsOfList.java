//**Concatenate all strings in the list, separated by commas.
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateElementsOfList {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList(" shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        //concatenating list elements using joining method of Collectors
        String newString=list.stream().collect(Collectors.joining(" ")) ;
        //printing the concatenated String
        System.out.println(newString);
    }
}
