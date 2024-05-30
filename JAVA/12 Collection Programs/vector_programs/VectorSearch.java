// Vector Search: Develop a Java program that searches for a specific element within a vector using the Vector class. Implement algorithms like linear search or binary search to efficiently locate the element.
package vector_programs;

import java.util.Vector;

public class VectorSearch {
    public int searchByLinearSearch(Vector vector,int value)
    {
        int index=-1;
        for (int i = 0; i < vector.size() ; i++) {
            if (Integer.parseInt(vector.get(i).toString()) == value)
                index=i;

        }
        return index;
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
        vector.add(11);
        vector.add(200);
        vector.add(1000);
        vector.add(345);
        vector.add(4567);
        vector.add(3);
        vector.add(678);
        //printing Vector
        System.out.println("The elements of Vector are : "+vector);
        VectorSearch vectorSearch=new VectorSearch();
        System.out.println("Searching the index of 4567 using LinearSearch");
        System.out.println("The index is : "+vectorSearch.searchByLinearSearch(vector,4567));

    }
}
