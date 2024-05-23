//History Tracking System:**
//        - **Problem Statement:** Create a browsing history tracking system where users can add, remove, and search for web pages they have visited. Each web page should have properties such as `pageId`, `url`, `title`, and `visitDate`. Implement functionality to display all visited web pages, search for a web page by `url`, and display pages visited on a specific date.
//        - **Tasks:**
//        1. Add a new web page to the history.
//     2. Remove a web page by `pageId`.
//        3. Search for a web page by `url` and display its details.
//        4. Display all web pages.

package HistoryTrackingSystem;


import HistoryTrackingSystem.data.History;
import HistoryTrackingSystem.data.HistoryManager;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Date date;
         History history;
        HistoryManager historyManager=new HistoryManager();
        Scanner scanner = new Scanner(System.in);



        System.out.println("***************** Welcome to History Management System  ******************");
//creating menu driven program for History Management System .
        while (choice != 5) {
            System.out.println("Press 1 for adding page. Press 2 to remove page. Press 3 to search page. Press 4 to display all pages . Press 5 to exit.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter webpage name");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.next();
                    System.out.println("Enter webpage id");
                    int id = scanner.nextInt();
                    System.out.println("Enter url of webpage");
                    String url= scanner.next();
                    date=new Date();
                    historyManager.addHistory(id,name,url,date);
                    break;

                case 2:
                    System.out.println("enter ID of page to remove");
                    int removeID = scanner.nextInt();
                    historyManager.removePage(removeID);
                    break;
                case 3:
                    System.out.println("enter url of page to search");
                    String searchName= scanner.next();
                    historyManager.searchPage(searchName);
                    break;

                case 4:
                    historyManager.displayPage();

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
