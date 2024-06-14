//**Create a list of the first letters of each string in a list.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfFirstLetter {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        System.out.println("the original List is : "+list);
        System.out.println("List after converting to first letter : ");
        //Converting list to first letter of each strings in the list
        List result=list.stream().map(n->n.charAt(0)).collect(Collectors.toList());
        System.out.println(result);
    }
}
