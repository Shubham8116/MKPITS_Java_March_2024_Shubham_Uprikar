//Demonstration of inserting values into the database
package problem2;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //calling method and passing values as parameters
        int value=InsertDetails.insertData(6,"priya","patil","sinhgad road","pune");
        if (value!=0)
            System.out.println("record inserted successfully");
        else
            System.out.println("record not inserted");

    }
}
