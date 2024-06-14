// **Find the first string that starts with the letter 'A'.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LetterMatchingFromString {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahulaaaa","Akash","Atish","max","shruti","neha","priya","reshma","shabnam");
        //finding String that starts with "A" by using filter method and findFirst method
        Optional result =list.stream().filter(n->n.startsWith("A")).findFirst();
        System.out.println(result.get());
    }
}
