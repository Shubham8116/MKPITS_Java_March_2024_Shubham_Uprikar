// This class will return connection string if accessed connections are less than 5.
package data;

public class ConnectionManager {
    int count = 0;
    String connection = "jdbc:mysql://localhost:3306/shubham";


    public String getconnection() {
        count++;
        if (count < 5) {
            return this.connection;
        }
        else {
            return "Connection overflow";
        }

    }
}
