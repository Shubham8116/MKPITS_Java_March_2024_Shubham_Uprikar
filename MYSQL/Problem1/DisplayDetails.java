//This class will perform operations on database to fetch information based on the givan ID
package Problem1;

import java.sql.*;

public class DisplayDetails {
    public static void show(int id) throws SQLException, ClassNotFoundException {
        //establishing database connection
        Connection connection= DBConnection.connect();
        //creating Statement class object
        Statement stmt=connection.createStatement();
        //passing query to ResultSet object
        ResultSet rs=stmt.executeQuery("select * from persons where PersonID="+id);
        //accessing metadata of the table
        ResultSetMetaData resultSetMetaData=rs.getMetaData();
        int count=resultSetMetaData.getColumnCount();
        //accessing records using ResultSet object
        if (rs.next()) {
            System.out.println();
            for (int i = 1; i <=count; i++) {
                System.out.print(rs.getString(i)+" ");
            }
            while (rs.next()) {
                System.out.println();
                for (int i = 1; i <= count; i++) {
                    System.out.print(rs.getString(i)+" ");
                }
            }
            rs.close();
        }
        else
        {
            System.out.println("ID not found");
        }

    }
}
