package Part1_Phone;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args) {

//        . Класс Phone.
//        Создайте класс Phone, который содержит переменные number, model и
//        weight.
//                Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных.
//        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
//        звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
//        возвращает номер телефона. Вызвать эти методы для каждого из
//        объектов.
//                Добавить конструктор в класс Phone, который принимает на вход три
//        параметра для инициализации переменных класса - number, model и
//        weight.
//                Добавить конструктор, который принимает на вход два параметра для
//        инициализации переменных класса - number, model.
//                Добавить конструктор без параметров.
//                Вызвать из конструктора с тремя параметрами конструктор с двумя.
//        Добавьте перегруженный метод receiveCall, который принимает два
//        параметра - имя звонящего и номер телефона звонящего. Вызвать этот
//        метод.
//                Создать метод sendMessage с аргументами переменной длины. Данный
//        метод принимает на вход номера телефонов, которым будет отправлено
//        сообщение. Метод выводит на консоль номера этих телефонов.


//Create phone with constructor with three parameters
        Phone phone1 = new Phone("+375291234567", "Samsung a51", 190);

        //Create phone with constructor with two parameters
        Phone phone2 = new Phone("+375291234568", "Samsung a51", 0);

        //Create phone with constructor with two parameters
        Phone phone3 = new Phone("unknown", "unknown", 0);

        //Phone info with 0-3 parameters
        System.out.println(phone1.getPhoneInfo());
        System.out.println(phone2.getPhoneInfo());
        System.out.println(phone3.getPhoneInfo());
        System.out.println("\n*********************************************************\n");

        //Why do I use Scanner here, but not in class Phone????????????
        Scanner callerName = phone1.scan();

        System.out.println(phone1.receiveCall(String.valueOf(callerName)));
        System.out.println(phone2.receiveCall(String.valueOf(callerName)));
        System.out.println(phone3.receiveCall(String.valueOf(callerName)));
        System.out.println("\n*********************************************************\n");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println("\n*********************************************************\n");

        //Call overloaded method - ?????????????????????????
//        System.out.println(phone1.receiveCall(callerName, number));

        phone1.sendMessage();


    }
}

