//**Count how many strings in a list contain the letter 'e'.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.List;

public class CountStringHavingLetter {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","ere","neha","priya","reshma","shabnam");
        //filtering strings having "e" letter by using filter method
        System.out.println(list.stream().filter(n->n.contains("e")).count());

    }
}
