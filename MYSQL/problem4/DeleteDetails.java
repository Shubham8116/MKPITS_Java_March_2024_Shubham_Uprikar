//this class will perform opeartion for deleting record from table
package problem4;

import problem2.DBConnection;

import java.sql.*;

public class DeleteDetails  {
    public static int deleteData(int roll)throws SQLException,ClassNotFoundException
    {
        //establishing connection using user defined class
        Connection connection= DBConnection.connect();
        //creating sql query using PreparedStatement
        PreparedStatement   preparedStatement= connection.prepareStatement("delete from student where rollno=?");
        //passing parameters to query using setInt method
        preparedStatement.setInt(1,roll);
        //executing query
        int value= preparedStatement.executeUpdate();

        return value;

    }
}
