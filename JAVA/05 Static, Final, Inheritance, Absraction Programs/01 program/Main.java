//Static Factory Method: Implement a static factory method in a class "ConnectionManager" to obtain database connections.
//Ensure that only a limited number of connections are allowed to be created.
import data.ConnectionManager;

public class Main {
    public static void main(String[] args) {
        ConnectionManager connectionManager=new ConnectionManager();
        System.out.println( connectionManager.getconnection());
        System.out.println( connectionManager.getconnection());
        System.out.println( connectionManager.getconnection());
        System.out.println( connectionManager.getconnection());
        System.out.println( connectionManager.getconnection());
        System.out.println( connectionManager.getconnection());

    }
}
