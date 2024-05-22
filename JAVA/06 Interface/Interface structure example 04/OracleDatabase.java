//class OracleDatabase will implement interface DatabaseOperations methods .
package data;

public class OracleDatabase implements DatabaseOperations
{
    @Override
    public void create(String name) {
        System.out.println("Creating Database");

    }

    @Override
    public void read(int id) {
        System.out.println("Reading Database");
    }

    @Override
    public void update(int id, String newdata) {
        System.out.println("Updating database");

    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting Database");
    }
}
