//Customer Order Management:**
//   - **Problem Statement:** Develop a customer order management system for a retail business. Each order should have properties such as `orderId`, `customerName`, `product`, `quantity`, and `orderDate`. Implement functionality to add new orders, update the quantity of an order, remove orders, and display all orders sorted by order date.
//   - **Tasks:**
//     1. Add a new order to the list.
//     2. Remove an order by `orderId`.
//     3. Search order by order ID .
//     4. Display all orders sorted by their order date.
package CustomerOrderManagement;

import CustomerOrderManagement.data.CustomerManagement;
import TaskManagementSystem.data.TaskOperations;
import TaskManagementSystem.data.Tasks;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Date date;
        CustomerManagement customerManagement=new CustomerManagement();
        Scanner scanner = new Scanner(System.in);

        System.out.println("***************** Welcome to Customer Order management system  ******************");
//creating menu driven program for Contact management system .
        while (choice != 5) {
            System.out.println("Press 1 for adding order. Press 2 to remove order. Press 3 to search order. Press 4 to display all orders . Press 5 to exit.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter customer name");
                    String name = scanner.next();
                    System.out.println("Enter order id");
                    int id = scanner.nextInt();
                    System.out.println("Enter product name");
                    String product = scanner.next();
                    System.out.println("Enter quantity");
                    int quantity= scanner.nextInt();
                    date=new Date();
                    customerManagement.addCustomer(id,name,product,quantity,date);
                    break;

                case 2:
                    System.out.println("enter id of order to remove");
                    int removeID = scanner.nextInt();
                    customerManagement.removeCustomer(removeID);
                    break;
                case 3:
                    System.out.println("enter id of order to search");
                    int searchID= scanner.nextInt();
                    customerManagement.searchOrder(searchID);
                    break;

                case 4:
                    customerManagement.displayTask();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter valid choice");
                    break;
            }

        }
    }
}
