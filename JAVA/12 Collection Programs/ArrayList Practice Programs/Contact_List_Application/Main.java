//Contact List Application:
//Problem Statement: Create a contact list application where users can add, remove, and search for contacts. Each contact should have properties such as contactID, name, phoneNumber, and email. Implement functionality to display all contacts, search for a contact by name, and update a contact's phone number and email.
//Tasks:
//Add a new contact to the list.
//Remove a contact by contactID.
//Search for a contact by name and display their details.
//Update the phone number and email of an existing contact.
package Contact_List_Application;

import Contact_List_Application.data.Contact;
import Contact_List_Application.data.ContactManagement;
import Inventory_Management_System.data.Store;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int choice = 0;
        Contact contact;
        ContactManagement contactManagement=new ContactManagement();
        Scanner scanner = new Scanner(System.in);

        System.out.println("***************** Welcome to Contact management system  ******************");
//creating menu driven program for Contact management system .
        while (choice != 5) {
            System.out.println("Press 1 for adding contact. Press 2 to remove contact. Press 3 to search contact. Press 4 to update contact . Press 5 to exit.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter cotact name");
                    String name = scanner.next();
                    System.out.println("Enter contact id");
                    int id = scanner.nextInt();
                    System.out.println("Enter mobile number");
                    int number = scanner.nextInt();
                    System.out.println("Enter E-mail ");
                    String email = scanner.next();
                    contactManagement.addContact(id, name, number, email);
                    break;
                case 2:

                    System.out.println("enter id of contact to remove");
                    int removeID = scanner.nextInt();
                    contactManagement.removeContact(removeID);
                    break;
                case 3:
                    System.out.println("enter name of contact to search");
                    String searchName = scanner.next();
                    contactManagement.searchByName(searchName);

                    break;

                case 4:
                    System.out.println("enter name of contact to update");
                    String update = scanner.next();
                    contactManagement.updateByName(update);

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