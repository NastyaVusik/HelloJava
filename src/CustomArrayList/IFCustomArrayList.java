package CustomArrayList;

public interface IFCustomArrayList<E> {

    //Method for addition of element to ArrayList
    void addElement(int index, E element);

    boolean addElement(E element);

    //Method for deletion of element from ArrayList
    boolean removeElement(int index);

    //Method for returning element by index
    E getElement(int index);

    //Method for checking availability of element in ArrayList
    boolean checkElement(E element);

    //Method for clearing all ArrayList
    boolean clearAll();

}
