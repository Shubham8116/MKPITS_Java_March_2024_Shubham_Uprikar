//Unique Product Identifier Manager:**
//   - **Problem Statement:** Develop a system to manage a collection of unique product identifiers (e.g., SKUs). Each identifier should be unique. Implement functionality to add new identifiers, check for the existence of an identifier, remove an identifier, and display all unique identifiers.
//   - **Tasks:**
//     1. Add a new product identifier to the collection.
//     2. Check if a specific product identifier exists.
//     3. Remove a product identifier from the collection.
//     4. Display all unique product identifiers.
package Unique_Product_Identifier_Manager;


import Unique_Product_Identifier_Manager.data.Product;
import Unique_Product_Identifier_Manager.data.ProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Product  product;
        ProductManager productManager=new ProductManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("***************** Welcome to Unique Product identifier ******************");
//this will add unique identifier
        productManager.addIdentifier("abcd");
        productManager.addIdentifier("pqr");
        productManager.addIdentifier("cvg");
        productManager.addIdentifier("yes");
        productManager.addIdentifier("abcd");
        // this will remove identifier
        productManager.removeIdentifier("cvgl");
        productManager.removeIdentifier("yes");

        //this will search for the identifier
        productManager.checkIdentifier("abcd");
        //displaying identifiers
        productManager.displayIdentifier();



    }
}
