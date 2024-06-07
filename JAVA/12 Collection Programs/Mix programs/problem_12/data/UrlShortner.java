//this class will store url shortcode and its original url
package problem_12.data;

import java.util.Hashtable;
import java.util.Map;

public class UrlShortner {
    private Hashtable<String,String> hashMap=new Hashtable<>();
    public void addURL (String code, String details)
    {
        hashMap.put(code,details);
        System.out.println("URL added successfully !");
    }
    public void removeURL(String code)
    {
        int count=0;
        for (Map.Entry a:hashMap.entrySet())
        {
            if ((a.getKey().toString()).equals(code))
            {
                hashMap.remove(a.getKey());//will remove URL using key
                System.out.println("URL removed successfully");
                count++;
                return;
            }
        }
        if (count==0)
            System.out.println("enter correct name");

    }

    public void display()
    {
        System.out.println("URL  are : ");
        for (Map.Entry a:hashMap.entrySet())//looping through stored URLs
        {
            System.out.println("The URL code is : "+a.getKey());//printing key
            System.out.println("The details are: "+a.getValue());//printing value

        }
    }
}
