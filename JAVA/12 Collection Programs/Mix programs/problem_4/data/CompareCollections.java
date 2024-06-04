package problem_4.data;

import java.util.*;

public class CompareCollections {
    public void showComparision(List list) {
        //getting current time
        long start=System.currentTimeMillis();
        //creating hashset with fixed size list and printing it
        HashSet hashSet = new HashSet(list);
        System.out.println("hashset is : "+hashSet);
        //getting current time
        long end=System.currentTimeMillis();
        //calculating time required for storing and retrieving elements
        long totalTime=end-start;
        System.out.println("Total time taken by Hashset is : "+totalTime);


        //getting current time
        start=System.currentTimeMillis();
        //creating linkedhashset with fixed size list
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        System.out.println("linkedhashset is : "+linkedHashSet);
        //getting current time
        end=System.currentTimeMillis();
        //calculating time required for storing and retrieving elements
        totalTime=end-start;
        System.out.println("Total time taken by linkedhashset is : "+totalTime);

        //getting current time
        start=System.currentTimeMillis();
        //creating treeset with fixed size list
        TreeSet treeSet = new TreeSet(list);
        System.out.println("treeset is : "+treeSet);
        //getting current time
        end=System.currentTimeMillis();
        //calculating time required for storing and retrieving elements
        totalTime=end-start;// treeset will take more time because of sorting elements .
        System.out.println("Total time taken by treeset is : "+totalTime);


    }
}
