//Event Scheduling System:**
//   - **Problem Statement:** Develop an event scheduling system where users can add, remove, and search for events. Each event should have properties such as `eventId`, `eventName`, `location`, `date`, and `time`. Implement functionality to display all events, search for an event by `eventName`, and display events happening at a specific location.
//   - **Tasks:**
//     1. Add a new event to the list.
//     2. Remove an event by `eventId`.
//     3. Search for an event by `eventName` and display its details.
//     4. Display all events happening at a specified location.
package EventSchedulingSystem;


import EventSchedulingSystem.data.Events;
import EventSchedulingSystem.data.ManageEvents;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        LocalDate date;
        Events events;
        ManageEvents manageEvents=new ManageEvents();
        Scanner scanner = new Scanner(System.in);



        System.out.println("***************** Welcome to Event Scheduling System  ******************");
//creating menu driven program for Contact management system .
        while (choice != 5) {
            System.out.println("Press 1 for adding Event. Press 2 to remove Event. Press 3 to search Event. Press 4 to display all Events . Press 5 to exit.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter event name");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.next();
                    System.out.println("Enter event id");
                    int id = scanner.nextInt();
                    System.out.println("Enter location of event");
                    String location= scanner.next();
                    System.out.println("Enter event date in the format - 2024-12-30 OR 2024-01-04");
                    String dateEvent= scanner.next();
                    date=LocalDate.parse(dateEvent);
                    manageEvents.addEvent(id,name,location,date);

                    break;

                case 2:
                    System.out.println("enter ID of event to remove");
                    int removeID = scanner.nextInt();
                    manageEvents.removeEvent(removeID);
                    break;
                case 3:
                    System.out.println("enter name of event to search");
                    String searchName= scanner.next();
                    manageEvents.searchEvent(searchName);
                    break;

                case 4:
                    manageEvents.displayEvent();
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
