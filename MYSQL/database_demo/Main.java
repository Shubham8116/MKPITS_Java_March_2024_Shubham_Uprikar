//demonstration of fetching data from table
package database_demo;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //establishing database connection
        Connection connection= DBConnection.connect();
        //creating Statement class object
        Statement stmt=connection.createStatement();
        //passing query to ResultSet object
        ResultSet rs=stmt.executeQuery("select * from persons");
        //accessing metadata of the table
        ResultSetMetaData resultSetMetaData=rs.getMetaData();
        int count=resultSetMetaData.getColumnCount();
        for (int i = 1; i <=count ; i++) {
            //printing column name
            System.out.print(resultSetMetaData.getColumnName(i));
            System.out.print("  ");
        }
        System.out.println();
        //accessing each rcords using ResultSet object
        while(rs.next())
        {
            System.out.println();
            System.out.print(rs.getInt(1));

            for (int i = 2; i <= count; i++)
            {
                System.out.print("  " + rs.getString(i));
            }
        }
//closing database connection
        connection.close();


    }

}
