//### Problem 4: Comparing Different Set Implementations
//**Objective:** Implement a program that demonstrates the differences between `HashSet`, `LinkedHashSet`, and `TreeSet` in terms of insertion order, retrieval order, and performance.
//
//**Requirements:**
//- Create three sets: `HashSet`, `LinkedHashSet`, and `TreeSet`.
//- Insert a predefined list of integers (including some duplicates) into each set.
//- Display the contents of each set after all insertions.
//- Measure and compare the time taken for insertion and retrieval operations for each set.
package problem_4;

import problem_4.data.CompareCollections;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list= Arrays.asList(90,10,3,68,10,34,4300,1,345,90);//creating fixed sized List
        System.out.println("Passing list to Collections : "+list);
        CompareCollections compareCollections = new CompareCollections();
        compareCollections.showComparision(list);//calling method
    }
}
