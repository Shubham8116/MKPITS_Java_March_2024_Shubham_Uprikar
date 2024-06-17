//**Check if all strings in the list are non-empty.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;

public class StringNonEmptyCheck {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","neha","priya","reshma","shabnam","");
        //finding String which is empty by using filter method that prints messsage if a String is found empty
        list.stream().filter((n)->{if(n.isEmpty()) System.out.println("String found empty");return true;}).forEach(System.out::println);
    }
}
