//this class will perform operation of inserting data into the table
package problem2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDetails {
    public static int insertData(int roll,String fname,String lname,String addr, String city) throws SQLException, ClassNotFoundException {
        //establishing connection using user defined class
        Connection connnection= DBConnection.connect();
        //creating sql query using PreparedStatement
        PreparedStatement preparedStatement= connnection.prepareStatement("insert into student values(?,?,?,?,?)");
        //passing parameters to query using setInt and setString method
        preparedStatement.setInt(1,roll);
        preparedStatement.setString(2,fname);
        preparedStatement.setString(3,lname);
        preparedStatement.setString(4,addr);
        preparedStatement.setString(5,city);
        //executing query
        int value=preparedStatement.executeUpdate();
        return value;
    }
}
