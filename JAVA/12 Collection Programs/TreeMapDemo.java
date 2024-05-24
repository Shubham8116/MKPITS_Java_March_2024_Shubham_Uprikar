//program to demonstrate TreeMap class

import java.util.*;
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap();
        map.put(0,"shubham");
        map.put(4,"pooja");
        map.put(8,"neha");
        map.put(5,"akash");
        map.put(7,"sneha");
        map.put(6,"shubham");
        map.put(null,"su");// will show NullPointer Exception
        System.out.println(map);//will print sorted map according to keys.
        System.out.println(map.keySet());//will print all keys
        System.out.println(map.values());//will print all values

    }
}
