//Static Counter Implementation: Implement a static counter in a class "Product" to keep track of the number of instances created.
//Ensure that each time a new instance of the Product class is created, the counter increments automatically.
import data.Product;

public class Main {

    public static void main(String[] args) {
        Product product=new Product();
        Product product1=new Product();
        Product product2=new Product();
        Product product3=new Product();
        System.out.println(Product.count);
    }
}
