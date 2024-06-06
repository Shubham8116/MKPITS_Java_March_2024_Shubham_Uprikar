//### Problem 9: Sorted Contact List
//**Objective:** Create a program to manage a sorted contact list.
//
//**Requirements:**
//- Use `TreeMap` to store contact names as keys and phone numbers as values.
//- Allow adding, updating, deleting, and retrieving contacts.
//- Print the contact list in alphabetical order.
package problem_9;

import problem_9.data.StoreContacts;

public class Main {
    public static void main(String[] args) {
        StoreContacts storeContacts=new StoreContacts();
        storeContacts.addContact("shubham",9422700939L);//passing contacts to method for storing
        storeContacts.addContact("Ashish",9421879939L);
        storeContacts.addContact("sneha",5634567890L);
        storeContacts.addContact("pooja",9504005050L);
        storeContacts.addContact("rohini",9864308990L);
        storeContacts.displaycontact();//calling display method
        storeContacts.deleteContact("rohini");//deleting contact
        storeContacts.displaycontact();//calling display method

    }
}
