import java.util.Objects;

public class HashMapKey implements Comparable<Key> {
    private Integer priority;

    public HashMapKey(Integer priority) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashMapKey that = (HashMapKey) o;
        return Objects.equals(priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority);
    }


    @Override
    public String toString() {
        return "Key(priority = " + priority + ")";
    }
}
