//**Convert a list of strings to uppercase
package stream_practice_programs;

import java.util.*;

public class StringToUppercase {
    public static void main(String[] args) {
        //creating a list of type String
        List<String>  list=Arrays.asList(" shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        //converting list elements to uppercase
        list.stream().map(n->n.toUpperCase()).forEach(System.out::println);
    }
}
