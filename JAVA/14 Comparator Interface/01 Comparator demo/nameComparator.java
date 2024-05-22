//creating comparator to sort using students name
import java.util.Comparator;

public class nameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
