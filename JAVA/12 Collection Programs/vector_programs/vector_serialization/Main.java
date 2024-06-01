//Vector Serialization: Design a Java application that serializes and deserializes a vector of custom objects using the Vector class. Save the vector to a file, then read it back into memory and reconstruct the original vector.
package vector_programs.vector_serialization;

import vector_programs.vector_serialization.data.VectorInFile;

import java.io.IOException;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        VectorInFile  vectorInFile=new VectorInFile();
        //creating Vector of custom objects
        Vector vector=new Vector<>();
        vector.add(1);
        vector.add(4);
        vector.add(100);
        vector.add(6);
        vector.add("raina");
        vector.add("irfan");
        vector.add("mahi");
        vector.add("yuvraj");
        vector.add("virat");
        vector.add("sachin");
        System.out.println("The vector is : "+vector);
        //adding vector to file
        vectorInFile.addToFile(vector);
        //reading vector from file
        vectorInFile.readFromFile();
    }
}
