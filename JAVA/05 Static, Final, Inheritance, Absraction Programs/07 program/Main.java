//Abstract Geometric Shapes: Extend the Shape example by adding abstract methods for calculating volume in the abstract Shape class.
//Implement concrete classes like Sphere, Cube, and Cylinder inheriting from Shape and providing their volume calculation .
import data.Cube;
import data.Cylinder;
import data.Sphere;

public class Main {
    public static void main(String[] args) {
        Sphere sphere=new Sphere();
        sphere.calculateVolume();
        Cube cube=new Cube();
        cube.calculateVolume();
        Cylinder cylinder=new Cylinder();
        cylinder.calculateVolume();
    }
}
