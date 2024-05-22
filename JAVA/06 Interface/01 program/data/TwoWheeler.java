//Demonstrating implementation of Interface on a class with extending another class
//Here interface Motorbike and car are implemented on the class TwoWheeler
//class Car is extended by class TwoWheeler.
package data;

public class TwoWheeler extends Car implements Motorbike,Cycle{
    @Override
    public void distance() {
        System.out.println("The distance is 50 meters");

    }
//overriding methods of interface
    @Override
    public void speed() {
        System.out.println("The speed is 90 km/hr");
    }
    public void display()
    {
        System.out.println("The name of the car is Wagon-R");
    }
}
