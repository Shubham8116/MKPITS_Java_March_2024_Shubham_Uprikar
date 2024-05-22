//Menu driven program to write in the file and read from the file using Student class object.
//this program will display and write student data in the file.
//this program can search student name and display his marks.
// Student class is serialized.

package MenuDriven_Student_info;

import java.io.*;
import java.util.Scanner;

public class WriteViewObjectFromFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student s1;
        ObjectOutputStream  objectOutputStream;
        File  file=new File("f:\\filedemo\\studentdata.txt");
        objectOutputStream=new ObjectOutputStream(new FileOutputStream(file,true));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        BufferedWriter  bufferedWriter=new BufferedWriter(new FileWriter(file,true));

        System.out.println("Welcome.......");
        int choice=0;
        while(choice!=3)
        {


            System.out.println("press 1. to write student data to file");
            System.out.println("press 2. to view student data from file");
            System.out.println("press 3. to view marks by entered student name from file");
            System.out.println("press 4. to exit");
            Scanner  scanner=new Scanner(System.in);
            choice= scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter student name");
                    String name= scanner.next();
                    System.out.println("Enter student marks");
                    int marks= scanner.nextInt();;
                    s1=new Student(name,marks);
                  //  bufferedWriter.newLine();
                    objectOutputStream.writeObject(s1);
                    System.out.println("Data is successfully stored in the file");

                    break;

                case 2:

                   s1 = (Student)(objectInputStream.readObject());
                   while(s1!=null)
                   {


                       System.out.println("The name is: " + s1.getName());
                       System.out.println("The marks are " + s1.getMarks());
                       s1 = (Student)(objectInputStream.readObject());


                   }
                   objectInputStream.close();

                    break;

                case 3:
                    ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream(file));
                    System.out.println("Enter name to view marks");
                    String search= scanner.next();
                    int found=0;
                    s1 = (Student)(objectInputStream1.readObject());
                    while(s1!=null)
                    {

                        if(s1.getName().equalsIgnoreCase(search))
                        {
                            found++;

                            System.out.println("The marksss are " + s1.getMarks());
                        }

                        s1 = (Student)(objectInputStream1.readObject());

                    }
                    if (found==0)
                    {
                        System.out.println("sorry no name found");
                    }

                    break;

                case 4: objectOutputStream.close();
                        System.exit(0);
                         break;
            }
        }
    }
}
