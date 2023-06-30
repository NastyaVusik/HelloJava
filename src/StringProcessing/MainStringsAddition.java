package StringProcessing;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class MainStringsAddition {

//    1. Дана строка произвольной длины с произвольными словами.
//    Найти самое короткое слово в строке и вывести его на экран.
//    Найти самое длинное слово в строке и вывести его на экран.
//    Если таких слов несколько, то вывести последнее из них.

//            2. Дана строка произвольной длины с произвольными словами. Найти слово,
//    в котором число различных символов минимально. Слово может
//    содержать буквы и цифры. Если таких слов несколько, найти первое из
//    них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть
//"fffff".

//        3. Дана строка произвольной длины с произвольными словами. Написать
//    программу для проверки является ли любое выбранное слово в строке
//    палиндромом.
//            TeachMeSkills.by
//    Например, есть строка, вводится число 3, значит необходимо
//    проверить является ли 3-е слово в этой строке палиндромом.
//    Предусмотреть предупреждающие сообщения на случаи ошибочных
//    ситуаций: например, в строке 5 слов, а на вход программе передали число
//500 и т. п. ситуац
//

    public static void main(String[] args) {

        searchShortLongWord(String);


    }

    // 1) Method for searching the longest and shortest words in the text
    static String searchShortLongWord(String text) {

        //Create scanner and input any text
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any text: ");
        text = scan.nextLine();

        //Create array from this text
        String[] textArr = text.split(" ");
        System.out.println("\n Array from text:" + "\n" + textArr);


        scan.close();
        return "The shortest word is " + shortWord + ";\n" +
                "the longest word is " + longWord;
    }
}

