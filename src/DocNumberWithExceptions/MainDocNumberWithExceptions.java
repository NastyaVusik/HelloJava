package DocNumberWithExceptions;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class MainDocNumberWithExceptions {

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

        //Creation of Scanner scan
        Scanner scan = new Scanner(System.in);

        //Output document number
        try {
            System.out.println("Document number is " + getDocNumber(scan));
        } catch (DocNumberExceptions e) {
            System.out.println(e);
        }

        //Method for checking, if document's number contains line "abc"
        try {
            System.out.println("Document's number contains line \"abc\" with case ignore: " + checkContainsAbc());
        } catch (ContainsABCException e) {
            System.out.println(e);
        }

        //Method for checking, if document's number begins with sequence "555"
        try {
            System.out.println("Document's number begin with sequence \"555\": " + checkBeginning555());
        } catch (BeginWith555Exception e) {
            System.out.println(e);
        }

        //Method for checking, if document's number ends with sequence "1a1b"
        try {
            System.out.println("Document's number ends with sequence \"1a1b\": " + checkEnding1a1b());
        } catch (EndWith1a1bException e) {
            System.out.println(e);
        } finally {
            scan.close();
        }
    }

//        try {
//            //Output document number
//            System.out.println("Document number is " + getDocNumber(scan));
//            System.out.println("\n**********************************************\n");
//
//            //Method for checking, if document's number contains line "abc"
//            System.out.println("Document's number contains line \"abc\" with case ignore: " + checkContainsAbc());
//            System.out.println("\n**********************************************\n");
//
//            //Method for checking, if document's number begins with sequence "555"
//            System.out.println("Document's number begin with sequence \"555\": " + checkBeginning555());
//            System.out.println("\n**********************************************\n");
//
//            //Method for checking, if document's number ends with sequence "1a1b"
//            System.out.println("Document's number ends with sequence \"1a1b\": " + checkEnding1a1b());
//            System.out.println("\n**********************************************\n");
//        } catch (Exception e) {
//            e.getMessage();
//        }
//
//    }


    //Declare of variables
    static String docNumber;
    static final int docNumbLength = 22;


    //Method for output document number
    static String getDocNumber(Scanner scan) throws DocNumberExceptions {

        //Creation of Scanner scan
//            Scanner scan = new Scanner(System.in);

        System.out.println("Enter document number in format xxxx-yyy-xxxx-yyy-xyxy, where x — is number, а y — is letter: ");
        docNumber = scan.nextLine();
        if (docNumber.length() != docNumbLength) {
            throw new DocNumberExceptions();
        }
        scan.close();
        return docNumber;
    }


    //Method for checking, if document's number contains line "abc"
    static Boolean checkContainsAbc() throws ContainsABCException {
        String testStr = "abC";

        //Convert line testStr to lower case
        testStr = testStr.toLowerCase();

        //Create new line newStr equal docNumber. Convert line newStr to lower case
        String newStr = docNumber;
        newStr = newStr.toLowerCase();

        if (newStr.contains(testStr)) {
            return true;
        } else throw new ContainsABCException();
    }


    //Method for checking, if document's number begins with sequence "555"
    static Boolean checkBeginning555() throws BeginWith555Exception {
        String testStr = "555";

        if ((docNumber.substring(0, 3)).equals(testStr)) {
            return true;
        } else throw new BeginWith555Exception();
    }


    //Method for checking, if document's number ends with sequence "1a1b"
    static boolean checkEnding1a1b() throws EndWith1a1bException {
        String testStr = "1a1b";

        if (docNumber.endsWith("1a1b")) {
            return true;
        } else throw new EndWith1a1bException();
    }

}



