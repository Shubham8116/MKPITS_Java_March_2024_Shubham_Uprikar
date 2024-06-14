//**Find the string with the minimum length.**
package stream_practice_programs;

import java.util.*;

public class MinimumStringLength {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","neha","priya","reshma","shabnam");
        //using min() method and passing comparator to calculate minimum String
        Optional a=list.stream().min(Comparator.comparing(n->n.length()));
        //printing minimum String
        System.out.println(a.get());

    }
}
