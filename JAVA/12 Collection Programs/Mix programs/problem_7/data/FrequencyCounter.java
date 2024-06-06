//this class will count frequency of the words
package problem_7.data;

import java.io.*;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class FrequencyCounter {
    public void count(String name) throws IOException
    {
        Hashtable<String,Integer>  hashtable=new Hashtable();
        File file=new File(name);
        BufferedReader  bufferedReader=new BufferedReader(new FileReader(file));
        String input=bufferedReader.readLine();
        String words[];

        while(input!=null)
        {

            words=input.split(" ");
            for (int i = 0; i < words.length ; i++)
            {
                int freq=1;
             if (hashtable.containsKey(words[i])==false)
             {
                 hashtable.put(words[i],freq);// this will add words in the hashtable if it is not inserted earlier
             }
             else
             {
                 freq=hashtable.get(words[i]);// getting already  stored frequency
                 freq++;//increament frequency
                 hashtable.put(words[i],freq);// this will overrride particular word's frequency value
             }

            }
            input=bufferedReader.readLine();// will read next line
        }
        System.out.println("File read successfully !");
        System.out.println("printing words and their frequencies");
        for (Map.Entry a:hashtable.entrySet())
        {
            System.out.print("Word is : "+"'"+a.getKey()+"'");
            System.out.println(" and its frequency is : "+a.getValue());
        }
    }

}
