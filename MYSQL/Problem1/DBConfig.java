//class to create static fields for jdbc driver,url,username,password that can be reused in another classes
package Problem1;

public class DBConfig {
    //creating String object for the jdbc driver
    public final static String driver="com.mysql.cj.jdbc.Driver";
    //creating String url for the database connection
    public final static String  url="jdbc:mysql://localhost:3306/test";
    //creating String username for the database connection
    public final static String username="root";
    //creating String password for the database connection
    public final static String password="Shubham123";
}
