//this class will store the words in Treeset
package problem_5.data;

import java.util.Comparator;
import java.util.TreeSet;

public class StoreWords {
    public void store(String name)
    {
        //creating TreeSet for storing words regardless of case sensitivity
        TreeSet<String>  treeSet=new TreeSet();

        String words[]=name.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            treeSet.add(words[i]);//adding words
        }
        System.out.println("words stored successfully");
        System.out.println("Printing unique words");
        for (String o:treeSet)
        {
            System.out.println(o);//printing words
        }
    }
}
