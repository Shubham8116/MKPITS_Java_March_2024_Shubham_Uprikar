import java.util.*;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        //creating list
        List<Integer> list= Arrays.asList(12,43,12,56,43);

        Set set=new HashSet(list);//removing duplicate elements.
        System.out.println(set);


    }


}
