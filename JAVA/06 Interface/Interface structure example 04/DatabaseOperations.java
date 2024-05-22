package data;

public interface DatabaseOperations {
    void create(String name);
    void read(int id);
    void update(int id, String newdata);
    void delete(int id);

}
