//program to demonstrate HashMap class
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        //creating Hashmap for cities and their temperature
        Map<String,Integer> map=new HashMap();
        // adding elements in the HashMap
        map.put("Nagpur",50);
        map.put("Mumbai",45);
        map.put("Delhi",10);
        map.put("Pune",40);
        map.put("Hydrabad",30);
        map.put(null,null);
        map.put(null,null);// will not allow because HashMap allows only one null key.
        //displaying Map
        System.out.println(map);
        //displaying keys
        System.out.println(map.keySet());
        //displaying values
        System.out.println(map.values());
        System.out.println(map.size());// printing size
        System.out.println(map.isEmpty());//checking for empty or not
        map.putIfAbsent("Gondia",34);
        map.remove("Nagpur");
        System.out.println(map);
        // for loop for HashMap
        for (Map.Entry a:map.entrySet())
        {
            System.out.println(a.getKey());
            System.out.println(a.getValue());
        }


    }
}
