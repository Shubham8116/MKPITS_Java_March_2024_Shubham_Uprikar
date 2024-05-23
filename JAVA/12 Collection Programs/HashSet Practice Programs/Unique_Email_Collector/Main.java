// **Problem Statement:** Create a system to collect and manage unique email addresses. Implement functionality to add new email addresses, check if an email address already exists, remove an email address, and display all unique email addresses.
//   - **Tasks:**
//     1. Add a new email address to the collection.
//     2. Check if a specific email address exists.
//     3. Remove an email address from the collection.
//     4. Display all unique email addresses.
package Unique_Email_Collector;

import Unique_Email_Collector.data.Email;
import Unique_Email_Collector.data.EmailManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int choice = 0;
        Email email;
        EmailManager emailManager=new EmailManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("***************** Welcome to Unique Email Collector ******************");
//creating menu driven program for Unique Email Collector .
        while (choice != 5) {
            System.out.println("Press 1 for adding Email. Press 2 to remove email. Press 3 to search email. Press 4 to display all emails . Press 5 to exit.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter email ID ");
                    Scanner scanner1 = new Scanner(System.in);
                    String inputemail = scanner.next();
                    emailManager.addEmail(inputemail);
                    break;

                case 2:
                    System.out.println("enter emailID to remove");
                    String removeEmail = scanner.next();
                    emailManager.removeEmail(removeEmail);
                    break;
                case 3:
                    System.out.println("enter emailID to check if it exists");
                    String searchName = scanner.next();
                    emailManager.checkExists(searchName);
                    break;

                case 4:
                    emailManager.display();

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
