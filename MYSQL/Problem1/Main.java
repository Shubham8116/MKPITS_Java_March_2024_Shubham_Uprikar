//program to access table records based on the given ID
package Problem1;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //calling method and providing ID for the record
        DisplayDetails.show(1);
    }
}
