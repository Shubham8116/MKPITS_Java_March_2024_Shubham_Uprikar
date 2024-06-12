//this class will perform opeartion for updating data of table
package problem3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDetails {
    public static int updateData(int roll,String addr,String city) throws SQLException, ClassNotFoundException {
        //establishing connection using user defined class
        Connection   connection=DBConnection.connect();
        //creating sql query using PreparedStatement
        PreparedStatement preparedStatement= connection.prepareStatement("update student set address=?,city=? where rollno=?");
        //passing parameters to query using setInt and setString method
        preparedStatement.setString(1,addr);
        preparedStatement.setString(2,city);
        preparedStatement.setInt(3,roll);
        //executing query
        int value= preparedStatement.executeUpdate();
        return value;
    }
}
