package data;

public class Teacher extends Person{
    public Teacher(String name,int age)
    {
        Person  person=new Person();
        person.displayInfo(name,age);
    }
}
