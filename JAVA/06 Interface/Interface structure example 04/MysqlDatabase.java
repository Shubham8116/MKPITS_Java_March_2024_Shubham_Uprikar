//class MysqlDatabase will implement interface DatabaseOperations methods.
package data;

public class MysqlDatabase implements DatabaseOperations{
    @Override
    public void create(String name) {
        System.out.println("Creating database");
    }

    @Override
    public void read(int id) {
        System.out.println("Reading database");

    }

    @Override
    public void update(int id, String newdata) {
        System.out.println("Updating Database");
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting Database");

    }
}
