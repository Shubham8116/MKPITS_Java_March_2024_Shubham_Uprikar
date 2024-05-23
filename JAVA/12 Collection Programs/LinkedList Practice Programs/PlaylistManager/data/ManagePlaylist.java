package PlaylistManager.data;

import TaskManagementSystem.data.DateComparator;
import TaskManagementSystem.data.Tasks;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class ManagePlaylist {
    int count =0;
    LinkedList linkedList=new LinkedList();
    Iterator iterator;
    Playlist playlist;
    public void addSong(int id,String title,String artists, String album,int duration)
    {
        playlist=new Playlist(id ,title, artists,album,duration);
        linkedList.add(playlist);
        System.out.println("new song added successfully");

    }
    public void removeSong(int searchTd)
    {
        count=0;
        iterator= linkedList.iterator();
        while (iterator.hasNext())
        {
            playlist=(Playlist)iterator.next();
            if (playlist.getSongId()==searchTd)
            {
                linkedList.remove(playlist);
                System.out.println("Song removed successfully !");
                count++;
            }
        }
        if (count==0)
            System.out.println("No record found with the given ID");
    }
    public void searchSong(int searchID)
    {
        count=0;
        iterator= linkedList.iterator();
        while (iterator.hasNext())
        {
            playlist=(Playlist)iterator.next();
            if (playlist.getSongId()==searchID)
            {
                System.out.println("The info of song is as follows : ");
                System.out.println(playlist);
                count++;
            }
        }
        if (count==0)
            System.out.println("No record found with the given ID");
    }
    public void displaySong()
    {
        if(linkedList.size()!=0) {
            System.out.println(" Songs according to duration");
            Collections.sort(linkedList, new DurationComparator());
            System.out.println(linkedList);
        }
        else
            System.out.println("It is empty");

    }
}
