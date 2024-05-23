//Playlist Manager:**
//   - **Problem Statement:** Create a music playlist manager where users can add, remove, and search for songs. Each song should have properties such as `songId`, `title`, `artist`, `album`, and `duration`. Implement functionality to display all songs, search for a song by `title`, and display songs sorted by their duration.
//   - **Tasks:**
//     1. Add a new song to the playlist.
//     2. Remove a song by `songId`.
//     3. Search for a song by `title` and display its details.
//     4. Display all songs sorted by their duration.
package PlaylistManager;

import PlaylistManager.data.ManagePlaylist;
import PlaylistManager.data.Playlist;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        LocalDate date;
        Playlist playlist;
        ManagePlaylist managePlaylist=new ManagePlaylist();
        Scanner scanner = new Scanner(System.in);

        System.out.println("***************** Welcome to playlist manager  ******************");
//creating menu driven program for Contact management system .
        while (choice != 5) {
            System.out.println("Press 1 for adding song. Press 2 to remove song. Press 3 to search song. Press 4 to display all songs . Press 5 to exit.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter song name");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.next();
                    System.out.println("Enter song id");
                    int id = scanner.nextInt();
                    System.out.println("Enter song artists");
                    Scanner  scanner2=new Scanner(System.in);
                    String artists = scanner2.nextLine();
                    System.out.println("Enter song album");
                    String album= scanner.next();
                    System.out.println("Enter duration of song in seconds");
                    int duration= scanner.nextInt();
                    managePlaylist.addSong(id,name,artists,album,duration);
                    break;

                case 2:
                    System.out.println("enter id of song to remove");
                    int removeID = scanner.nextInt();
                    managePlaylist.removeSong(removeID);
                    break;
                case 3:
                    System.out.println("enter id of song to search");
                    int searchID= scanner.nextInt();
                    managePlaylist.searchSong(searchID);
                    break;

                case 4:
                    managePlaylist.displaySong();
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
