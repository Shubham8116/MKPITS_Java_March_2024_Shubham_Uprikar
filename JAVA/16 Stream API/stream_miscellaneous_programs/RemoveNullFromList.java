//**Remove null elements from a list.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;

public class RemoveNullFromList {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul",null,"max",null,"","","shruti","neha","priya","reshma","shabnam");
        //removing null elements from the list
        list.stream().filter(n->n!=null&&n!="").forEach(System.out::println);

    }
}
