//Problem Statement: Create a simple student management system where you can add, remove, and search for students in a class. Each student should have properties such as id, name, and grade. Implement functionality to display all students, search for a student by id, and display students sorted by their grades.
//Tasks:Add a student to the list.
//Remove a student by id.
//Search for a student by id and display their details.
//Display all students sorted by their grades.
package Student_Management_System;

import Student_Management_System.data.Student;

import java.util.*;

public class Main implements Comparator<Student> {
    public static void main(String[] args) {
        int choice=0;
        int count=0;
        Scanner  scanner=new Scanner(System.in);
        ArrayList<Student> arrayList=new ArrayList<Student>();//creating ArrayList of type student.
        Student student;
        System.out.println("***************** Welcome to student management system  ******************");
//creating menu driven program for student info.
        while (choice!=5)
        {
            System.out.println("Press 1 for add student info. Press 2 for remove student info. Press 3 for search student info. Press 4 for display student info. Press 5 to exit.");
            choice= scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter student name");
                    String name=scanner.next();
                    System.out.println("Enter student id");
                    int id=scanner.nextInt();
                    System.out.println("Enter student grade form A to z");
                    String grade= scanner.next();
                    student =new Student(id,name,grade);
                    arrayList.add(student); // adding student info in the ArrayList .
                    System.out.println("Student info added");
                    break;
                case 2:
                    if(arrayList.size()==0)
                    {
                        System.out.println("student data is empty");
                    }
                    else {
                        count = 0;
                        System.out.println("enter id of student to remove");
                        int removeId = scanner.nextInt();
                        //performing iteration through Iterator.
                        Iterator iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            //typecasting to Student type
                            Student studentRemove = (Student) iterator.next();
                            if (removeId == studentRemove.getId()) {
                                arrayList.remove(arrayList.indexOf(studentRemove));//student info is removed
                                System.out.println("student info is removed");
                                count++;
                                break;
                            }

                        }
                        if (count == 0)
                            System.out.println("No student found with the given Id .");
                    }

                    break;
                case 3:
                    if(arrayList.size()==0)
                    {
                        System.out.println("student data is empty");
                    }
                    else {
                        count = 0;
                        System.out.println("enter id of student to search");
                        int searchId = scanner.nextInt();
                        //performing iteration through Iterator.
                        Iterator iterator1 = arrayList.iterator();
                        while (iterator1.hasNext()) {
                            //typecasting to Student type
                            Student studentSearch = (Student) iterator1.next();
                            if (searchId == studentSearch.getId()) {
                                System.out.println("student info is : ");
                                System.out.println(studentSearch);
                                count++;
                                break;
                            }

                        }
                        if (count == 0)
                            System.out.println("No student info is found with the given Id .");
                    }
                    break;

                case 4:
                    if(arrayList.size()==0)
                    {
                        System.out.println("student data is empty");
                    }
                    else {
                        Collections.sort(arrayList, new Main());
                        Iterator iterator2 = arrayList.iterator();
                        while (iterator2.hasNext()) {
                            System.out.println(iterator2.next().toString());
                        }
                    }
                    break;
                case 5:System.exit(0);
                        break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }

    }

    @Override
    public int compare(Student o1, Student o2) {
       return o1.getGrade().compareTo(o2.getGrade());
    }
}
