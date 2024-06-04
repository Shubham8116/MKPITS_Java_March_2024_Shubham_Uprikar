package problem_3.data;

import java.util.Iterator;
import java.util.TreeSet;

public class StoreAndReadIntegers {
    //creating TreeSet
    TreeSet<Integer> Set = new TreeSet();

    public void storeNumbers(int value) {

        Set.add(value);//adding values to TreeSet
        System.out.println("Item stored successfully");
    }

    public void printNumbers() {
        Iterator iterator = Set.iterator();
        System.out.println("Printing unique and sorted elements ");
        //using iterator printing elements
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
