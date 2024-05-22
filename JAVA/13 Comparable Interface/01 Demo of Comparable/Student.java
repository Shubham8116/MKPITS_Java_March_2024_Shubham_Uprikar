public class Student implements Comparable{
    int marks;
    String name;

    public Student() {

    }

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
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

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
    //sorting by marks

    //overriding compareTo method.
    @Override
    public int compareTo(Object o) {
        return new Integer(this.marks).compareTo(((Student)o).getMarks());

        //OR

//        if(marks==((Student)o).marks)
//            return 0;
//        else if(marks>((Student)o).marks)
//            return 1;
//        else
//            return -1;

    }


    //sorting by name


//    @Override
//    public int compareTo(Object o) {
//        return name.compareTo(((Student)o).name);

    //OR


//        if(name.compareTo(((Student)o).name)==0)
//             return 0;
//        else if(name.compareTo(((Student)o).name)>0)
//            return 1;
//        else
//            return -1;




}
