//Vector Sorting: Write a Java program that sorts a vector of integers in ascending order using the Vector class. Implement sorting algorithms such as bubble sort, selection sort, or quick sort .
package vector_programs;

import java.util.Collections;
import java.util.Vector;

public class VectorSorting {
    public Vector sortByBubble(Vector vector)
    {
        Object temp;
        for (int i = 0; i <vector.size() ; i++) {
            for (int j = i+1; j < vector.size() ; j++) {
                if (Integer.parseInt(vector.get(i).toString())>Integer.parseInt(vector.get(j).toString()))
                {
                 temp=vector.get(i);
                 vector.set(i,vector.get(j));
                 vector.set(j,temp);

                }

            }
        }

        return vector;
    }
    public static void main(String[] args) {
        //creating vector of numbers
        Vector<Integer> vector=new Vector<>();
        //adding elements to the Vector
        vector.add(34);
        vector.add(19);
        vector.add(100);
        vector.add(890);
        vector.add(49);
        vector.add(56);
        vector.add(1);
        vector.add(100);
        vector.add(200);
        vector.add(1000);
        vector.add(345);
        vector.add(4567);
        vector.add(3);
        vector.add(678);
        //printing Vector
        System.out.println("The elements of Vector are : "+vector);
        VectorSorting  vectorSorting=new VectorSorting();
        System.out.println("Vector after sorting using bubble sort is : ");
        System.out.println(vectorSorting.sortByBubble(vector));
        System.out.println("Vector after sorting using quick sort is : ");
        Collections.sort(vector);//using Collections class method to sort the Vector
        System.out.println(vector);
    }
}
