import java.util.Comparator;

public class KeyReverseComparator implements Comparator<Key> {

    @Override
    public int compare(Key o1, Key o2) {
        if (o1.priority > o2.priority) {
            return -1;
        } else if (o1.priority < o2.priority) {
            return 1;
        }
        return 0;
    }
}
