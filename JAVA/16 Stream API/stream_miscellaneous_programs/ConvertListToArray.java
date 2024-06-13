//**Convert a list of integers to an array.**
package stream_practice_programs;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {
    public static void main(String[] args) {
        //creating List of Integers
        List<Integer> list= new ArrayList();
        for (int i = 0; i <100 ; i++) {
            list.add(i);

        }
        Integer array[]=list.stream().toArray(Integer[]::new);
    }
}
