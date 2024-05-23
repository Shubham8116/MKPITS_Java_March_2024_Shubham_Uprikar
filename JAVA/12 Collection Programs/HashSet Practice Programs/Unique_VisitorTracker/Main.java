// **Unique Visitor Tracker:**
//   - **Problem Statement:** Develop a system to track unique visitors to a website. Each visitor can be represented by their IP address. Implement functionality to add new visitor IP addresses, check if an IP address has visited before, remove an IP address, and display all unique visitor IP addresses.
//   - **Tasks:**
//     1. Add a new visitor's IP address to the collection.
//     2. Check if a specific IP address has visited before.
//     3. Remove an IP address from the collection.
//     4. Display all unique visitor IP addresses.
package Unique_VisitorTracker;

import Unique_VisitorTracker.data.VisitorManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VisitorManagement visitorManagement=new VisitorManagement();
        System.out.println("***************** Welcome to Unique Visitor Tracker ******************");
        // creating unique visitors
        visitorManagement.addVisitor("198.07.05");
        visitorManagement.addVisitor("198.07.04");
        visitorManagement.addVisitor("198.07.01");
        visitorManagement.addVisitor("198.07.06");
        //removing 198.07.04 form HashSet

        visitorManagement.checkVisitor("194.67.8");
        visitorManagement.removeVisitor("198.07.04");
        visitorManagement.displayVisitor();
    }
}
