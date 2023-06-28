package StringProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class MainDocNumber {

//    Написать программу со следующим функционалом:
//    На вход передать строку (будем считать, что это номер документа). Номер
//    документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y —
//    это буква.
//            - Вывести на экран в одну строку два первых блока по 4 цифры. -
//            - Вывести на экран номер документа, но блоки из трех букв заменить на
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
//    1234-wer-5678-Abc-5r6y

    public static void main(String[] args) {

        //Output document number
        System.out.println("Document number is " + getDocNumber());
        System.out.println("\n**********************************************\n");

        //Method for output 2 first blocks with four numbers
        System.out.println("The first eight digits of the document number are " + getEightNumb());
        System.out.println("\n**********************************************\n");

        //Method for replace blocks with three letters with symbol '*'
        System.out.println("Document's number with replaced first six letters with symbol '*': " + getStarsInsteadLetters());
        System.out.println("\n**********************************************\n");

        //Method for get line with letters in format yyy/yyy/y/y
        System.out.println("The letters from document's number in format yyy/yyy/y/y: " + getLetterLine());
        System.out.println("\n**********************************************\n");

        //Method for get line with letters in format Letters:yyy/yyy/y/y with upper case
        System.out.println("The letters from document's number in format Letters:yyy/yyy/y/y with upper case: " + getLetterLineUpperCase());
        System.out.println("\n**********************************************\n");

        //Method for checking, if document's number contains line "abc"
        System.out.println("Document's number contains line \"abc\" with case ignore: " + checkContainsAbc());
        System.out.println("\n**********************************************\n");

        //Method for checking, if document's number begins with sequence "555"
        System.out.println("Document's number begin with sequence \"555\": " + checkBegining555());
        System.out.println("\n**********************************************\n");
    }


    //Declare of variables
    static String docNumber;
    static final int docNumbLength = 22;


    //Method for
    static String getDocNumber() {

        //Creation of Scanner scan
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter document number in format xxxx-yyy-xxxx-yyy-xyxy, where x — is number, а y — is letter: ");
        docNumber = scan.nextLine();
        if (docNumber.length() != docNumbLength) {
            System.out.println("Length of the document's number isn't equal 22 symbols");
        }
        return docNumber;
    }


    //Method for output 2 first blocks with four numbers
    static String getEightNumb() {
        String newStr = "";
        docNumber.toCharArray();
        for (int i = 0; i < docNumbLength; i++) {
            if (Character.isDigit(docNumber.charAt(i)) && (newStr.length() < 8)) {
                newStr += docNumber.charAt(i);
            }
        }
        return newStr;
    }


    //Method for replace blocks with three letters with symbol '*'
    static String getStarsInsteadLetters() {
        String newStr = docNumber;

        for (int i = 0, count = 0; i < newStr.length() & count < 6; i++) {
            if (Character.isLetter(newStr.charAt(i))) {
                newStr = newStr.replaceFirst(String.valueOf(newStr.charAt(i)), "*");
                count++;
            }
        }
        return newStr;
    }


    //Method for get line with letters in format yyy/yyy/y/y
    static String getLetterLine() {
        String newStr = docNumber;
        char[] charArray = newStr.toCharArray();
        String StrFormat = "yyy/yyy/y/y";
        char[] StrFormatArray = StrFormat.toCharArray();

        for (int i = 0, j = 0; (i < charArray.length) & (j < StrFormatArray.length); i++) {
            if (StrFormatArray[j] == 'y' & Character.isLetter(charArray[i])) {
                StrFormatArray[j] = charArray[i];
                j++;
            } else if (StrFormatArray[j] != 'y') {
                j++;
            }
        }
        return String.valueOf(StrFormatArray);
    }


    //Method for get line with letters in format Letters:yyy/yyy/y/y with upper case
    static StringBuilder getLetterLineUpperCase() {
        String newStr = docNumber;
        char[] charArray = newStr.toCharArray();
        String StrFormat = "yyy/yyy/y/y";
        char[] StrFormatArray = StrFormat.toCharArray();

        for (int i = 0, j = 0; (i < charArray.length) & (j < StrFormatArray.length); i++) {
            if (StrFormatArray[j] == 'y' & Character.isLetter(charArray[i])) {
                StrFormatArray[j] = charArray[i];
                j++;
            } else if (StrFormatArray[j] != 'y') {
                j++;
            }
        }

        StringBuilder resStr = new StringBuilder((String.valueOf(StrFormatArray)).toUpperCase());
        resStr = resStr.insert(0, "Letters:");
        return resStr;
    }


    //Method for checking, if document's number contains line "abc"
    static Boolean checkContainsAbc() {
        String testStr = "abC";

        //Convert line testStr to lower case
        testStr = testStr.toLowerCase();

        //Create new line newStr equal docNumber. Convert line newStr to lower case
        String newStr = docNumber;
        newStr = newStr.toLowerCase();

        if (newStr.contains(testStr)) {
            return true;
        } else return false;
    }


    //Method for checking, if document's number begins with sequence "555"
    static Boolean checkBegining555() {

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
//            if(0<=docNumberArr[i].isNumeric()<=3){
//                //
//            }
//        }
//        return "docNumberArr";
//    }


}
