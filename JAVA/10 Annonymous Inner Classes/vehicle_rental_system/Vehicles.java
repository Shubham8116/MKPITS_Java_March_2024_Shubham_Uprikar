//demonstrating Annaonymous inner class.
//Interface Reantable's methods are used .
//Here different annonymous claases are created for bike, car, truck.
package vehicle_rental_system;

public class Vehicles {
    public static void main(String[] args) {

        Rentable rent_bike=new Rentable() {
            @Override
            public void calculateRent(int rent_time, int rent_per_hour) {
                System.out.println("Total rent of bike is :"+rent_time*rent_per_hour);
            }

            @Override
            public void displayDetails(String vehicle_type, String _Vehicle_brand) {
                System.out.println("Vehicle Type :-"+vehicle_type+"\tVehicle_brand :"+_Vehicle_brand);
            }
        };


        Rentable rentable_car=new Rentable() {
            @Override
            public void calculateRent(int rent_time, int rent_per_hour) {
                System.out.println("Total rent of car is :"+rent_time*rent_per_hour);

            }

            @Override
            public void displayDetails(String vehicle_type, String _Vehicle_brand) {
                System.out.println("Vehicle Type :-"+vehicle_type+"\tVehicle_brand :"+_Vehicle_brand);

            }
        };

        Rentable rentable_truck=new Rentable() {
            @Override
            public void calculateRent(int rent_time, int rent_per_hour) {
                System.out.println("Total rent of truck is :"+rent_time*rent_per_hour);
            }

            @Override
            public void displayDetails(String vehicle_type, String _Vehicle_brand) {

                System.out.println("Vehicle Type :-"+vehicle_type+"\tVehicle_brand :"+_Vehicle_brand);
            }
        };

        rent_bike.displayDetails("Bike","Unicorn");
        rent_bike.calculateRent(5,50);

        rentable_car.displayDetails("Car","Wagon-R");
        rentable_car.calculateRent(5,120);

        rentable_truck.displayDetails("Truck","Tata Ace");
        rentable_truck.calculateRent(5,500);
    }
}
