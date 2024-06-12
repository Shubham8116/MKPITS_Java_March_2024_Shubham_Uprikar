//class to establish database connection
package problem2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection connect() throws ClassNotFoundException, SQLException {
        //loading jdbc driver
        Class.forName(DBConfig.driver);
        System.out.println("Driver Loaded Successfully");
        Connection con=null;
        //establishing database connection
        con= DriverManager.getConnection(DBConfig.url, DBConfig.username, DBConfig.password);
        return con;
    }
}
