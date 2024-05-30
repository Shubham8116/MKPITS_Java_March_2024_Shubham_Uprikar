//Vector Operations: Implement a Java program that performs various operations on a vector, such as adding elements, removing elements, finding the size of the vector, and displaying its contents.
package vector_programs;

import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        //creating vector of numbers
        Vector<Integer> vector=new Vector<>();
        //adding elements to the Vector
        vector.add(34);
        vector.add(19);
        vector.add(100);
        vector.add(49);
        vector.add(56);
        vector.add(1);
        vector.add(100);
        vector.add(200);
        //printing Vector
        System.out.println("The elements of Vector are : "+vector);
        //printing size of the Vector
        System.out.println("size of vector is : "+vector.size());
        //removing element from the Vector using index number
        vector.remove(2);
        System.out.println("Vector after removing 100 is : "+vector);



    }
}
