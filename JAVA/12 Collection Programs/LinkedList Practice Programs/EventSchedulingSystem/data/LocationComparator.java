package EventSchedulingSystem.data;

import java.util.Comparator;

public class LocationComparator implements Comparator<Events>
{

    @Override
    public int compare(Events o1, Events o2) {
        return o1.location.compareTo(o2.location);
    }
}
