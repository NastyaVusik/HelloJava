// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class MainExceptions {

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
//    5554-wer-5678-Abc-1a1b


//    Доработать нулевое домашнее задание предыдущего урока. Теперь надо
//    создать свои классы исключений на каждую ситуацию: - Проверить содержит ли номер
//    документа последовательность abc. - Проверить
//    начинается ли номер документа с последовательности 555. - Проверить
//    заканчивается ли номер документа на последовательность 1a2b.
//    Если номер документа не удовлетворяет условию - то "бросить"
//    исключение.
//    В методе класса, в котором будут вызываться эти методы для
//    демонстрации работы, перехватить исключение конструкцией try-catch и
//    в блоке catch вывести сообщение для пользователя (сообщение на
//консоль).
        public static void main(String[] args) {

            //Output document number
            System.out.println("Document number is " + getDocNumber());
            System.out.println("\n**********************************************\n");

            //Method for checking, if document's number contains line "abc"
            System.out.println("Document's number contains line \"abc\" with case ignore: " + checkContainsAbc());
            System.out.println("\n**********************************************\n");

            //Method for checking, if document's number begins with sequence "555"
            System.out.println("Document's number begin with sequence \"555\": " + checkBeginning555());
            System.out.println("\n**********************************************\n");

            //Method for checking, if document's number ends with sequence "1a1b"
            System.out.println("Document's number ends with sequence \"1a1b\": " + checkEnding1a1b());
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
            scan.close();
            return docNumber;
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
        static Boolean checkBeginning555() {
            String testStr = "555";

            if ((docNumber.substring(0, 3)).equals(testStr)) {
                return true;
            } else return false;
        }


        //Method for checking, if document's number ends with sequence "1a1b"
        static boolean checkEnding1a1b() {
            String testStr = "1a1b";

            if (docNumber.endsWith("1a1b")) {
                return true;
            } else return false;
        }


        //Method for dublication all letters in the line
        static String dublicateLetters() {
            String originLine = "This tasks carry out my brains!";
            String finalLine = "";

            for (int i = 0; i < (originLine.length()); i++) {
                finalLine += String.valueOf(originLine.charAt(i)).concat(String.valueOf((originLine.charAt(i))));
            }

            System.out.println("originLine is: " + originLine);
            return finalLine;
        }
    }
    }
}

