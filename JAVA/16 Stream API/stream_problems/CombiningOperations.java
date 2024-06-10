//Combining Operations:
//Create a list of integers and use a stream to filter out the even numbers, double each remaining number, and then find the sum of the doubled numbers.
package stream_problems;

import java.util.Arrays;
import java.util.List;

public class CombiningOperations {
    public static void main(String[] args) {
        //creating fixed sized list of type Integer
        List<Integer> list= Arrays.asList(56,34,89,1,3,4,5,6,7,8,9,0);
        //performing sum by converting each list object into int using mapToInt method then adding values using sum method
        int sum=list.stream().filter(n->n%2!=0).map(n->n+n).mapToInt(n->n).sum();
        System.out.println("The sum is:"+sum);
    }
}
