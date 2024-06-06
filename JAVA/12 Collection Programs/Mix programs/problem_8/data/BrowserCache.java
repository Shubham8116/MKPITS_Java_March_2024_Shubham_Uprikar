package problem_8.data;

import java.util.LinkedHashMap;
import java.util.Map;

public class BrowserCache {
    int max=5;
    LinkedHashMap<String,String> hashMap=new LinkedHashMap();

    public void addToCache(String name,String content)
    {
        if (hashMap.containsKey(name))
        {
            System.out.println("Hit occurs so, url will not be added");//if the url already present in the hashmap then do not add to it
        }
        else
        {
            System.out.println("Miss occurs so, adding url to cache");//adding url to cache
            System.out.println(hashMap.size());
            if (hashMap.size()<max)
            {
                hashMap.put(name, content);
            }
            else
            {

                for(Map.Entry a: hashMap.entrySet())
                {
                        hashMap.remove(a.getKey());
                        System.out.println("url removed according to LRU policy");
                        hashMap.put(name,content);
                        System.out.println("new url has been added to cache");
                    return;
                }

            }

        }

    }
    public void accessCache(String accessName)
    {
        for (Map.Entry a:hashMap.entrySet())//searching for the specific url and displaying contents
        {
            if (a.getKey().equals(accessName))
            {
                System.out.println("The searched url is : "+a.getKey());
                System.out.println(" and The contents are : "+a.getValue());
            }
        }
    }
    public void displayCache()
    {
        System.out.println("displaying all stored urls");
        for (Map.Entry a:hashMap.entrySet())
        {
            System.out.println("The url is : "+a.getKey());//displaying cache contents
            System.out.println("  and the content is : "+a.getValue());
        }
    }
}
