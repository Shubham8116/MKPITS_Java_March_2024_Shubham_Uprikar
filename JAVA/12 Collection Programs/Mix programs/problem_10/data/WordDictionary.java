//this class will store words and its definition in the form of dictionary using TreeMap
package problem_10.data;

import java.util.Map;
import java.util.TreeMap;

public class WordDictionary {
    TreeMap<String ,String> treeMap=new TreeMap();

    public void addWord(String word, String define)
    {
       treeMap.put(word,define);
        System.out.println("Word added successfully !");
    }
    public void removeWord(String name)
    {
        int count=0;
        for (Map.Entry a:treeMap.entrySet())
        {
            if (a.getKey()==name)
            {
                treeMap.remove(a.getKey());//will remove word using key
                System.out.println("Word removed successfully");
                count++;
                return;
            }
        }
        if (count==0)
            System.out.println("enter correct name");

    }
    public void updateWord(String name,String change )
    {
        int count=0;
        for (Map.Entry a:treeMap.entrySet())
        {
            if (a.getKey()==name)
            {
                treeMap.replace(name,change);//will update word using key
                System.out.println("Word updated successfully");
                count++;
                return;
            }
        }
        if (count==0)
            System.out.println("enter correct name");
    }
    public void display()
    {
        System.out.println("Words are : ");
        for (Map.Entry a:treeMap.entrySet())//looping through stored words
        {
            System.out.println("The word is : "+a.getKey());//printing key
            System.out.println("The definition is : "+a.getValue());//printing value

        }
    }
}
