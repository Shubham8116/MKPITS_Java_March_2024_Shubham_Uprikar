//program to write in the file and read from the file using class object.
// Student class is serialized.
package Student_data_into_file;

import java.io.*;

public class FileDataByObject {
    public static void writeDataByObject(Student student) throws IOException {
       // creating ObjectOutputStream object to write in the file.
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("f:\\filedemo\\abc.txt"));

        objectOutputStream.writeObject(student);
        objectOutputStream.close();


    }

    public static Student readDataByObject() throws IOException, ClassNotFoundException {
        Student student;
        // creating ObjectInputStream object to read from the file.
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("f:\\filedemo\\abc.txt"));
        student=(Student)(objectInputStream.readObject());
        objectInputStream.close();
        return student;

    }

}
