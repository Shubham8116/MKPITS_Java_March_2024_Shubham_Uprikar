// **Create a map from a list of strings with the string as the key and its length as the value.**
package stream_practice_programs;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class StringIntoMap {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList(" shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        //creating map for type<String,Integer> and using lambda function to store String as key and its length as value
        Map<String, Integer> newresult=list.stream().collect(Collectors.toMap(n->n,n->n.length()));
        System.out.println(newresult);
        //creating map for type<String,Integer> and using method reference to store String as key and its length as value
        Map<String, Integer> newresult1=list.stream().collect(Collectors.toMap(String::toString,String::length));
        System.out.println(newresult1);



    }
}
