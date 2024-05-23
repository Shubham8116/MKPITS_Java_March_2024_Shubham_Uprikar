// creating Comparator to sort the songs according to duration
package PlaylistManager.data;

import java.util.Comparator;

public class DurationComparator implements Comparator<Playlist> {
    @Override
    public int compare(Playlist p1,Playlist p2)
    {
    return Integer.compare(p1.getDuration(),p2.getDuration());
//        if (p1.getDuration()== p2.getDuration())
//            return 0;
//        else if (p1.getDuration()>p2.getDuration()) {
//            return 1;
//        }
//            else
//            {
//                return -1;
//            }
//        }
    }
}
