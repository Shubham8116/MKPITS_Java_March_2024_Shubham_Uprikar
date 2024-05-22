//program to write in the file and read from the file using class object.
// Student class is serialized.
package Student_data_into_file;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student=new Student("shubham",90);
        FileDataByObject.writeDataByObject(student);
      Student  student1= FileDataByObject.readDataByObject();
        System.out.println(student1);// toString() method is overrrided


    }
}
