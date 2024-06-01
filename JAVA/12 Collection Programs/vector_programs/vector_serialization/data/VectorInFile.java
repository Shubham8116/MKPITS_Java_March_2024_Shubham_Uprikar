//VectorInFile class to perform operations on Vector
package vector_programs.vector_serialization.data;

import java.util.*;
import java.io.*;

public class VectorInFile implements Serializable{
    int size;

    File file=new File("abc.txt");
    Vector  vector1=new Vector();

    public void addToFile(Vector vector) throws IOException {
        size= vector.size();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(file,true));
        for (int i = 0; i < vector.size() ; i++) {
        objectOutputStream.writeObject(vector.get(i));
        }
        objectOutputStream.close();
        System.out.println("Vector writted successfully in file");
    }

    public void readFromFile() throws IOException, ClassNotFoundException {
        System.out.println("Reading from file");

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        for (int i = 0; i <size ; i++) {
            vector1.add(objectInputStream.readObject());
        }
        System.out.println("The original Vector is : "+vector1);
    }
}
