package CustomArrayList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayListMethods<E> implements IFCustomArrayList<E> {

    private E[] elementsArr;             //Create array for the basement of ArrayList
    private final int INITIAL_CAPACITY = 10;         //Initial size of the array

    private int size = 0;           //Create variable for initial quantity of element in the array


    //Constructor without parameters for initialisation of the array by default
    public CustomArrayListMethods() {
        this.elementsArr = (E[]) new Object[INITIAL_CAPACITY];
    }

    //Constructor with parameters for initialisation of the array with any size
    public CustomArrayListMethods(int size) {
        this.elementsArr = (E[]) new Object[size];
    }


    private void extendArrayIfNeed() {
        if (size == elementsArr.length) {
            elementsArr = Arrays.copyOf(this.elementsArr, (this.elementsArr.length * 3 / 2 + 1));
        }
    }


    //Method for addition of element to ArrayList
    @Override
    public void addElement(E element) {

        this.extendArrayIfNeed();
        elementsArr[size++] = element;
    }


    //Method for addition element in ArrayList on certain position
    @Override
    public void addElement(int index, E element) throws Exception {
        this.extendArrayIfNeed();

        for (int i = this.size; i >= index; i--) {
            elementsArr[i + 1] = elementsArr[i];
        }
        try {
            elementsArr[index] = element;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }


    //Method for removing element from the ArrayList from certain position
    @Override
    public boolean removeElement(int index) throws Exception {
        try {
            elementsArr[index] = null;
            for (int i = index; i < this.size; i++) {
                elementsArr[i] = elementsArr[i + 1];
            }
            size--;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            throw new RuntimeException();
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


    //Method for checking availability of element in ArrayList
    @Override
    public boolean checkElement(E element) {
        for (E el : elementsArr) {
            if (el == element) {
                return true;
            }
        }
        return false;
    }


    //Method for clearing all ArrayList
    @Override
    public boolean clearAll() {
        boolean change = false;
        for (E element : elementsArr) {
            element = null;
            change = true;
        }
        size = 0;
        return change;
    }


    //Method for print ArrayList to console

    @Override
    public String toString() {

        String str = "";
        if (size == 0) {
            return "Oops...[]";
        } else {
            for (int i = 0; i < (size - 1); i++) {
                str = str + elementsArr[i] + ", ";
            }
            str = "[ " + str + elementsArr[size - 1] + " ]";
        }

        return str;
    }


}
