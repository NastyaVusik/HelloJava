public class Key implements Comparable<Key> {
    int priority;

    public Key(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Key o) {
        if (this.priority > o.priority) {
            return 1;
        } else if (this.priority < o.priority) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Key {proirity = " + priority + "}";
    }

}
