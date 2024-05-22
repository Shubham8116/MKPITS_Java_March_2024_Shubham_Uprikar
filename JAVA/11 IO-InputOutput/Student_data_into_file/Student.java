// Student class from where data is read and writed.
//this class is serialized for conversion of object into bytestream.
package Student_data_into_file;

import java.io.Serializable;

public class Student implements Serializable {
    int marks;
    String name;
    public Student()
    {

    }
    public Student(String name,int marks)
    {
        this.marks=marks;
        this.name=name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//toString() method is overrided.
    @Override
   public String toString() {
        return "name :"+getName() +" marks :"+getMarks();
    }
}
