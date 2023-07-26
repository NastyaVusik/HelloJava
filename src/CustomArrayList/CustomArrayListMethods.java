package CustomArrayList;

import java.util.Arrays;

//public class CustomArrayListMethods<E> implements IFCustomArrayList<E> {
//
//    private E[] elementsArr;             //Create array for the basement of ArrayList
//    private final int INITIAL_SIZE = 10;         //Initial size of the array
//
//    private int position = 0;           //Create variable for initial position of element in the array
//
//    // private int capacity;
//
//
//    //Constructor without parameters for initialisation of the array by default
//    public CustomArrayListMethods() {
//        this.elementsArr = (E[]) new Object[INITIAL_SIZE];
//    }
//
//    //Constructor with parameters for initialisation of the array with any size
//    public CustomArrayListMethods(int size) {
//        this.elementsArr = (E[]) new Object[size];
//    }
//
//
//    //Method for addition of element to ArrayList
//
//    @Override
//    public boolean addElement(E element) {
//
//        while (position == elementsArr.length) {
//            elementsArr = Arrays.copyOf(this.elementsArr, (this.elementsArr.length * 3 / 2 + 1));
//            elementsArr[position++] = element;
//        }
//        return true;
//    }
//
//
//}
