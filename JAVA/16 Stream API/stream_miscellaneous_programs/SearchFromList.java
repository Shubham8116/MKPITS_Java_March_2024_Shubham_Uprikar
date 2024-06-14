//**Check if any string in the list contains the letter 'a'.
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchFromList {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList(" shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        //filtering strings having letter "a" using filter method and collecting it in newly created list
        List newlist=list.stream().filter(n->n.contains("a")).collect(Collectors.toList());
        //printing new list
        System.out.println(newlist);
    }
}
