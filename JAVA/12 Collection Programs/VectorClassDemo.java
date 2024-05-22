//Demonstrating Vector class
import java.util.*;
public class VectorClassDemo {
    public static void main(String[] args) {
        Vector vector=new Vector(2);
        vector.add("shubham"); //adding elements in the Vector
        vector.add("rahul");
        vector.add("pooja");
        vector.add("shubham");
        vector.add("shubham");
// printing size and the capacity of the  created Vector .
        System.out.println("The size of the vector is : "+vector.size());
        System.out.println("The capacity of the vector is :"+vector.capacity());
        System.out.println(vector.indexOf("pooja"));// printing index of the element .
        System.out.println(vector);
    }
}
