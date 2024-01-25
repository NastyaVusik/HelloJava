import java.util.List;

public class Page<T> {

    private List<T> posts;
    private T type;
    private List<? extends T> items;

    public List<T> getPosts() {
        return posts;
    }

    public List<? extends T> getItems() {
        return items;
    }

    public void setType(T type) {
        this.type = type;
    }

}
