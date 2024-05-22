package data;

public class Student extends Person
{
    public Student(String name,int age)
    {
        Person  person=new Person();
        person.displayInfo(name,age);
    }


}
