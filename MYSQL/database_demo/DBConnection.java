package database_demo;

import Problem1.DBConfig;

import java.sql.*;

public class DBConnection {
    public static Connection connect() throws ClassNotFoundException, SQLException {
        //loading jdbc driver
        Class.forName(DBConfig.driver);
        System.out.println("Driver Loaded Successfully");
        Connection con = null;
        //establishing database connection
        con = DriverManager.getConnection(DBConfig.url, DBConfig.username, DBConfig.password);
        return con;
    }
}
