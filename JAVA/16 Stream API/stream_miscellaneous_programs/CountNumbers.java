//**Count the number of elements in a list.
package stream_practice_programs;

import java.util.ArrayList;
import java.util.List;

public class CountNumbers {
    public static void main(String[] args) {
        //creating List of Integers
        List<Integer> list= new ArrayList();
        for (int i = 0; i <100 ; i++) {
            list.add(i);

        }
        //calculating count of numbers
        long a=list.stream().count();
        System.out.println("The count is : "+a);
    }
}
