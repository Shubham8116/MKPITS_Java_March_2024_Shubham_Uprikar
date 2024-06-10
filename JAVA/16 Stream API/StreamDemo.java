//This program will demonstrate use of Stream interface methods
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        //creating fixed sized  List of type String
        List<String> list= Arrays.asList("shubham","rahul","pooja","piyu");
        //Stream stream=list.stream();
        //mapping each strings to uppercase using map method of Stream and then using forEach method of Stream to print the strings
        list.stream().map(n->n.toUpperCase()).forEach(n-> System.out.println(n));
        //creating fixed sized  List of type Integer
        List<Integer> list1=Arrays.asList(45,3,78,100,47,67);
        //filtering each integer which are even using filter method of Stream and then print using forEach method
        list1.stream().filter(n->n%2==0).forEach(System.out::println);
        //OR
        List evenNumbers=list1.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        //OR by using lambda expression
        list1.stream().filter((n)->{if(n%2==0)return true;else return false;}).forEach(System.out::println);
        //creating fixed sized  List of type String and checking if it having "hello" word in it
        ArrayList<String> list2 =new ArrayList(Arrays.asList("shubham","hello","ajay","akshit","anaconda"));
        list2.stream().filter(n->n.contains("hello")).forEach(System.out::println);

    }
}
