// Movie Collection Manager:
//Problem Statement: Develop a movie collection manager where users can add, remove, and search for movies in their collection. Each movie should have properties such as movieID, title, director, genre, and yearReleased. Implement functionality to display all movies, search for a movie by title, and display all movies of a specific genre.
//Tasks:
//Add a new movie to the collection.
//Remove a movie by movieID.
//Search for a movie by title and display its details.
//Display all movies of a specific genre.
package Movie_Collection_Manager;

import Movie_Collection_Manager.data.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Movie> arrayList = new ArrayList<Movie>();//creating ArrayList of type Movie .
        Iterator iterator;
        Movie movie;
        System.out.println("***************** Welcome to Movie Collection Manager  ******************");
//creating menu driven program for Movie info.
        while (choice != 5) {
            System.out.println("Press 1 to add movie info. Press 2 to remove movie info. Press 3 for search movie info. Press 4 for display movies of specific genere . Press 5 to exit.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter movie ID");
                    int id = scanner.nextInt();
                    System.out.println("Enter movie title");
                    Scanner scanner1=new Scanner(System.in);
                    String title = scanner1.nextLine();
                    System.out.println("Enter movie director");
                    Scanner scanner2=new Scanner(System.in);
                    String director = scanner2.nextLine();
                    System.out.println("Enter movie genere");
                    String genere = scanner.next();
                    System.out.println("Enter movie release year");
                    int year = scanner.nextInt();
                    movie = new Movie(id, title, director, genere, year);
                    arrayList.add(movie); // adding movie info in the ArrayList .
                    System.out.println("movie info added");
                    break;
                case 2:
                    if (arrayList.size() == 0) {
                        System.out.println("movie data is empty");
                    } else {
                        count = 0;
                        System.out.println("enter id of movie to remove");
                        int removeId = scanner.nextInt();
                        //performing iteration through Iterator.
                        iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            //typecasting to Student type
                            Movie movieRemove = (Movie) iterator.next();
                            if (removeId == movieRemove.getMovieID()) {
                                arrayList.remove(arrayList.indexOf(movieRemove));//student info is removed
                                System.out.println("movie info is removed");
                                count++;
                                break;
                            }

                        }
                        if (count == 0)
                            System.out.println("No movie found with the given Id .");
                    }

                    break;
                case 3:
                    if (arrayList.size() == 0) {
                        System.out.println("movie data is empty");
                    } else {
                        count = 0;
                        System.out.println("enter id of movie to search");
                        int searchId = scanner.nextInt();
                        //performing iteration through Iterator.
                        Iterator iterator1 = arrayList.iterator();
                        while (iterator1.hasNext()) {
                            //typecasting to Student type
                            movie = (Movie) iterator1.next();
                            if (searchId == movie.getMovieID()) {
                                System.out.println("movie info is : ");
                                System.out.println(movie);
                                count++;
                                break;
                            }

                        }
                        if (count == 0)
                            System.out.println("No movie info is found with the given Id .");
                    }
                    break;

                case 4:
                    if (arrayList.size() == 0) {
                        System.out.println("movie data is empty");
                    } else {
                        count = 0;

                        System.out.println("Enter movie genere");
                        String searchGenere = scanner.next();
                        iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            movie = (Movie) iterator.next();
                            if (movie.getGenre().equalsIgnoreCase(searchGenere)) {
                                System.out.println(movie.getTitle());
                                count++;
                            }
                        }
                        if (count == 0)
                            System.out.println("Sorry! no movie found with given genere");
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
