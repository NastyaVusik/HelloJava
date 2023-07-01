package StringProcessing;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Arrays;
import java.util.Scanner;

public class MainStringsAddition {

//    1. Дана строка произвольной длины с произвольными словами.
//    Найти самое короткое слово в строке и вывести его на экран.
//    Найти самое длинное слово в строке и вывести его на экран.
//    Если таких слов несколько, то вывести последнее из них.
//    Example:
//    The sun is shine. This elephants are large! Cat go - to sleep as soon as possiblee

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

        System.out.println(searchShortLongWord());
        System.out.println("\n**********************************************\n");
        System.out.println(searchMinSymbols());
        System.out.println("\n**********************************************\n");
        System.out.println(checkPalindrome());
        System.out.println("\n**********************************************\n");


    }

    // 1) Method for searching the longest and shortest words in the text
    static String searchShortLongWord() {

        String shortWord = "";
        String longWord = "";

        //Create scanner and input any text
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any text: ");
        String text = scan.nextLine();

        //Create array from this text
        String[] textArr = text.split(" ");
        System.out.println("\n Array from text:" + "\n" + Arrays.toString(textArr));


        //Delete all punctuation marks
        for (int i = 0; i < textArr.length; i++) {
            textArr[i] = textArr[i].replaceAll("[^a-zA-Z]", "");
        }
        System.out.println("\n Array from text without punctuation marks:" + "\n" + Arrays.toString(textArr));
//        System.out.println(Integer.valueOf("t"));

        int max = String.valueOf(textArr[0]).length();
        int min = String.valueOf(textArr[0]).length();
        for (int i = 0; i < textArr.length; i++) {
            if ((textArr[i].length() >= max) && (!(textArr[i].equals("")))) {
                max = textArr[i].length();
                longWord = textArr[i];
            }
            if ((!(textArr[i].equals(""))) && (textArr[i].length() <= min)) {
                min = textArr[i].length();
                shortWord = textArr[i];
            }

        }

        scan.close();
        return "\n\nThe shortest word is " + "\"" + shortWord + "\"" + " with length = " + min + ";\n" +
                "the longest word is " + "\"" + longWord + "\"" + " with length = " + max;

    }


    //2) Method for searching word with minimum quantity of different symbols
    static String searchMinSymbols() {

        String str = "fffff ab f 1234 jkjk nnnnnnnb sssssssssssssssss";

//Create array from this line
        String[] strArr = str.split(" ");
        System.out.println("\n Array from text:" + "\n" + Arrays.toString(strArr));

//Initialising variable for element with the lowest quantity of symbols
        String minSymbolsStr = "";

        //Variable for keeping array's index of word with minimum symbols
        int minSymbSumIndex = 0;

        //Array for keeping quantity of new symbols in every word
        int[] tempSymbsumArr = new int[strArr.length];


// symbsum - counter of new symbols in the word
        int symbsum = 1;

        //Create array from quantity of new symbols in every word
        for (int i = 0; i < strArr.length; i++) {
            symbsum = 1;

            for (int j = 0; j < (strArr[i].length() - 1); j++) {
                if (strArr[i].charAt(j) != strArr[i].charAt(j + 1)) {
                    symbsum++;
                }

            }
            tempSymbsumArr[i] = symbsum;
        }
        System.out.println("\nArray of quantity of new symbols in every word: \n" + Arrays.toString(tempSymbsumArr));


        //Find minimum of tempSymbsumArr
        int min = tempSymbsumArr[0];

        //count - counter for identifying the number of minimum element of tempSymbsumArr
//        int count = 0;

        for (int i = 1; i < tempSymbsumArr.length; i++) {
            if (tempSymbsumArr[i] < min) {
                min = tempSymbsumArr[i];
//                count++;
                minSymbSumIndex = i;

            }
        }
        System.out.println("Minimum element of tempSymbsumArr = " + min);


        return "\nThe first word with minimum quantity of different symbols: " + strArr[minSymbSumIndex];
    }


//    3) Method for checking every word in the line, if it is palindrome

    static StringBuilder checkPalindrome() {
        StringBuilder = "";
    }


}






