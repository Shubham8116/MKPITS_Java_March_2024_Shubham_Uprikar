//**Concatenate a list of lists of strings into a single list of strings.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateListOfList {
    public static void main(String[] args) {
        //creating list 1 of type String
        List<String> list1= Arrays.asList("shubham","rahul","max");
        //creating list 2 of type String
        List<String> list2= Arrays.asList("shruti","neha");
        //creating list 3 of type String
        List<String> list3= Arrays.asList("priya","reshma","shabnam");
        //creating a list of list of type String
        List<List<String>> list=Arrays.asList(list1,list2,list3);
        System.out.println("The original list is : "+list);
        //converting List of List to single list
        List result=list.stream().flatMap(n->n.stream()).collect(Collectors.toList());
       System.out.println("The list after flatten is : "+result);

    }
}
