package CustomArrayList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayListMethods<E> implements IFCustomArrayList<E> {

    private E[] elementsArr;             //Create array for the basement of ArrayList
    private final int INITIAL_CAPACITY = 10;         //Initial size of the array

    private int size = 0;           //Create variable for initial size of element in the array


    //Constructor without parameters for initialisation of the array by default
    public CustomArrayListMethods() {
        this.elementsArr = (E[]) new Object[INITIAL_CAPACITY];
    }

    //Constructor with parameters for initialisation of the array with any size
    public CustomArrayListMethods(int size) {
        this.elementsArr = (E[]) new Object[size];
    }


    //Method for addition of element to ArrayList
    @Override
    public boolean addElement(E element) {

        while (size == elementsArr.length) {
            elementsArr = Arrays.copyOf(this.elementsArr, (this.elementsArr.length * 3 / 2 + 1));
            elementsArr[size++] = element;
        }
        return true;
    }

    public void getX() {
        AbstractList<String> x = new ArrayList<>();
        x.get(1);
    }


    //Method for addition element in ArrayList on certain position
    @Override
    public void addElement(int index, E element) throws Exception {

        try {
            elementsArr[index] = element;

        } catch (IndexOutOfBoundsException e) {
            e.getStackTrace();
        } catch (UnsupportedOperationException e) {
            e.getStackTrace();
        }

    }


    //Method for removing element from the ArrayList from certain position
    @Override
    public boolean removeElement(int index) throws Exception {
        try {
            elementsArr[index] = null;
            for (int i = index; i < elementsArr.length; i++) {
                elementsArr[i] = elementsArr[i + 1];
            }
            size--;
        } catch (IndexOutOfBoundsException e) {
            e.getStackTrace();
        }
        return true;
    }


    //Method for returning element by index
    @Override
    public E getElement(int index) throws Exception {
        try {
            if (index >= elementsArr.length) ;

        } catch (IndexOutOfBoundsException e) {
            e.getStackTrace();
        }
        return elementsArr[index];
    }

}
