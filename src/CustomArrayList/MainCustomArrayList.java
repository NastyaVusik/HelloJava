package CustomArrayList;

import java.util.ArrayList;

public class MainCustomArrayList {


//    Представим, что в Java нет коллекции типа ArrayList.
//    Создать свой класс, симулирующий работу класса динамической
//    коллекции - т.е. создать свою кастомную коллекцию.
//    В основе коллекции будет массив.
//    Кастомная коллекция должна хранить элементы разных классов(т.е. это
//                                                                       generic).
//    Предусмотреть операции добавления элемента, удаления элемента,
//    получение элемента по индексу, проверка есть ли элемент в коллекции,
//    метод очистки все коллекции.
//    Предусмотреть конструктор без параметров - создает массив размером
//    по умолчанию.
//    Предусмотреть конструктор с задаваемым размером внутреннего
//    массива.
//    Предусмотреть возможность автоматического расширения коллекции при
//    добавлении элемента в том случае, когда коллекция уже заполнена

    public static void main(String[] args) {

        //Create new custom arrayList with help of default constructor
        CustomArrayListMethods<String> arrayList1 = new CustomArrayListMethods<>(5);

        //Create new custom arrayList with help of parameterized constructor
        CustomArrayListMethods<String> arrayList2 = new CustomArrayListMethods<>(14);


        //Filling the ArrayLists
        arrayList1.addElement("beam");
        arrayList1.addElement("rafter");
        arrayList1.addElement("foundation");
        arrayList1.addElement("girt");
        arrayList1.addElement("window");

        //Method for addition of element to ArrayList
        System.out.println("Custom arrayList arrayList1 is: " + arrayList1);


        //Method for addition element at the end of ArrayList
        arrayList1.addElement("Door");
        System.out.println("Custom arrayList  arrayList1 with addition element is: " + arrayList1);


        //Method for addition element in ArrayList on certain position
        try {
            arrayList1.addElement(1, "Door");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Custom arrayList  arrayList1 with addition element in certain place is: " + arrayList1);


        //Method for removing element from the ArrayList from certain position
        try {
            arrayList1.removeElement(2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Custom arrayList  arrayList1 with deleted element is: " + arrayList1);


        //Method for returning element by index
        try {
            System.out.println("Returned element by index is: " + arrayList1.getElement(4));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //Method for checking availability of element in ArrayList
        System.out.println("The ArrayList contain this element: " + arrayList1.checkElement("truss"));


        //Method for clearing all ArrayList
        System.out.println("The ArrayList was cleared: " + arrayList1.clearAll());
        System.out.println(arrayList1);
    }

}
