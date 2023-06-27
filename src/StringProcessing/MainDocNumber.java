package StringProcessing;

import java.util.Scanner;

public class MainDocNumber {

//    Написать программу со следующим функционалом:
//    На вход передать строку (будем считать, что это номер документа). Номер
//    документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y —
//    это буква.
//            - Вывести на экран в одну строку два первых блока по 4 цифры. -
//    Вывести на экран номер документа, но блоки из трех букв заменить на
//*** (каждая буква заменятся на *).
//            - Вывести на экран только одни буквы из номера документа в формате
//    yyy/yyy/y/y в нижнем регистре.
//            - Вывести на экран буквы из номера документа в формате
//"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//            класса StringBuilder).
//            - Проверить содержит ли номер документа последовательность abc и
//    вывети сообщение содержит или нет(причем, abc и ABC считается
//            одинаковой последовательностью).
//            - Проверить начинается ли номер документа с последовательности 555.
//            - Проверить заканчивается ли номер документа на последовательность
//1a2b.
//    Все эти методы реализовать в отдельном классе в статических методах,
//    которые на вход (входным параметром) будут принимать вводимую на вход
//    программы строку.

    public static void main(String[] args) {

        String str = "";
        System.out.println(str.getDocNumber());
        System.out.println("Document number is " + str);

    }


    //Declare of variables
    static String docNumber;
    static final int docNumbLength = 22;


    //Method for
    public static String getDocNumber() {

        //Creation of Scanner scan
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter document number in format xxxx-yyy-xxxx-yyy-xyxy, where x — is number, а y — is letter: ");
        docNumber = scan.nextLine();
        if (docNumber.length() != docNumbLength) {
            System.out.println("Length of the document's number isn't equal 22 symbols");
        }
        return docNumber;
    }


    // Method for checking correct input of the document's number
//    public static String checkCorrectInput(String docNumber) {
//
//        //Creation of Scanner scan
//        Scanner scan = new Scanner(System.in);
//
//
//        System.out.println("Enter document number in format xxxx-yyy-xxxx-yyy-xyxy, where x — is number, а y — is letter: ");
//        docNumber = scan.nextLine();
//
//        //Create array for keeping document number
//        char[] docNumberArr = new char[docNumbLength];
//        docNumberArr = docNumber.toCharArray();
//        for (int i = 0; i < docNumbLength; i++) {
//            docNumberArr[i] = docNumber.charAt(i);
//            if(docNumberArr[0].isNumeric())
//        }
//        return "docNumberArr";
//    }


}
