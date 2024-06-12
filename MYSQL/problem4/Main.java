//Demonstration of deleting records from the table
package problem4;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //calling method and passing values as parameters
        int value= DeleteDetails.deleteData(7);
        if (value!=0)
            System.out.println("record deleted successfully");
        else
            System.out.println("record not deleted");

    }
}
