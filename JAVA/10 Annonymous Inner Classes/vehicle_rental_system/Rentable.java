package vehicle_rental_system;

public interface Rentable {
    //int rent=0;
    //String name="";
    public void calculateRent(int rent_time, int rent_per_hour);
    public void displayDetails(String vehicle_type, String _Vehicle_brand);

}
