//This class will perform operation for storing and retrieving Integer elements
package problem_2.data;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class StoreReadIntegers {
    //creating LinkedHashSet
    LinkedHashSet<Integer> hashSet = new LinkedHashSet();

    public void storeNumbers(int value) {

        hashSet.add(value);//adding values to LinkedHashSet
        System.out.println("Item stored successfully");
    }

    public void printNumbers() {
        Iterator iterator = hashSet.iterator();
        System.out.println("Printing unique elements ");
        //using iterator printing elements
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
