package Unique_Product_Identifier_Manager.data;

public class Product {
    String identifier;

    public Product(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
