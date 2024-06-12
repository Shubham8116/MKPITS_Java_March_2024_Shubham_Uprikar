//Demonstration of inserting values into the database
package problem3;
import java.sql.*;

public class Main {
    public static void main(String[] args)throws SQLException,ClassNotFoundException {
        //calling method and passing values as parameters
        int value=UpdateDetails.updateData(4,"bandra","mumbai");
        if (value!=0)
            System.out.println("record updated successfully");
        else
            System.out.println("record not updated");

    }
}
