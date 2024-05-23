//Library Book Management:
//Problem Statement: Create a library book management system where you can add, remove, and search for books. Each book should have properties such as ISBN, title, author, and yearPublished. Implement functionality to display all books, search for a book by ISBN, and display books published after a certain year.
//Tasks:
//Add a new book to the library.
//Remove a book by ISBN.
//Search for a book by ISBN and display its details.
//Display all books published after a specified year.
package Library_Book_Management;

import Library_Book_Management.data.Library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int choice = 0;
        Library library;
        ArrayList<Library> arrayList = new ArrayList<Library>();
        Scanner scanner = new Scanner(System.in);
        Iterator iterator;
        System.out.println("***************** Welcome to Library management system  ******************");
//creating menu driven program for library system.
        while (choice != 5) {
            System.out.println("Press 1 for adding book. Press 2 to remove book. Press 3 for searching book. Press 4 for display all books . Press 5 to exit.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter book name");
                    String name = scanner.next();
                    System.out.println("Enter ISBN");
                    int isbn = scanner.nextInt();
                    System.out.println("Enter author");
                    String author = scanner.next();
                    System.out.println("enter year published");
                    int year = scanner.nextInt();
                    library = new Library(isbn, name, author, year);
                    arrayList.add(library); // adding product info in the ArrayList .
                    System.out.println("book info added");
                    break;
                case 2:
                    if (arrayList.size() == 0) {
                        System.out.println("Library data is empty");
                    } else {
                        count = 0;
                        System.out.println("enter ISBN of book to remove");
                        int removeId = scanner.nextInt();
                        //performing iteration through Iterator.
                        iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            //typecasting to Student type
                            library = (Library) iterator.next();
                            if (removeId == library.getISBN()) {
                                arrayList.remove(library);
                                System.out.println("book is removed");
                                count++;
                                break;
                            }

                        }
                        if (count == 0)
                            System.out.println("No book info is found with the given ISBN .");
                    }
                    break;
                case 3:
                    if (arrayList.size() == 0) {
                        System.out.println("Library data is empty");
                    } else {
                        count = 0;
                        System.out.println("enter ISBN of book to search");
                        int searchId = scanner.nextInt();
                        //performing iteration through Iterator.
                        iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            //typecasting to Student type
                            library = (Library) iterator.next();
                            if (searchId == library.getISBN()) {
                                System.out.println("book info is : ");
                                System.out.println(library);
                                count++;
                                break;
                            }

                        }
                        if (count == 0)
                            System.out.println("No book info is found with the given ISBN .");
                    }
                    break;
                case 4:
                    if (arrayList.size() == 0) {
                        System.out.println("library data is empty");
                    } else {
                        System.out.println("all books info as follows: ");
                        iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            System.out.println(iterator.next().toString());
                        }
                    }
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