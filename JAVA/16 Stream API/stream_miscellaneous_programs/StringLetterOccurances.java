//**Find the string with the most occurrences of the letter 'a'.**
package stream_practice_programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringLetterOccurances {
    public static void main(String[] args) {
        //creating a list of type String
        List<String> list= Arrays.asList("shubham","rahul","max","shruti","neha","priya","reshma","shabnam","aaaa");
        //creating a new hashmap to store string and occurances of letter a
        Map<String,Long> map=new HashMap<>();
        for (int i = 0; i < list.size(); i++)
        {
         long count=list.get(i).toString().chars().filter(ch->ch=='a').count();// filtering each character of string that equals to letter a
         map.put(list.get(i),count); // adding to map
        }
        System.out.println("The String with maximum frequency of letter a is : ");
        //printing String having max occurance of letter a by comparingByValue() method of Map.Entry
        System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get());

    }
}
