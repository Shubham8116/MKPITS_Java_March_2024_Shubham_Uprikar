//filter even numbers from list
package stream_practice_programs;

import java.util.*;

//**Filter out even numbers from a list of integers
public class FilterEven {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList();
        for (int i = 0; i <100 ; i++) {
            list.add(i);

        }
        list.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
