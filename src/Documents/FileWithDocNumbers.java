package Documents;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWithDocNumbers {

//    Допустим есть txt файл с номерами документов.
//    Номером документа является строка, состоящая из букв и цифр(без
//                                                                        служебных символов).
//    Пусть этот файл содержит каждый номер документа с новой строки и в
//    строке никакой другой информации, только номер документа.
//    Валидный номер документа должен иметь длину 15 символов и
//    начинаться с последовательности docnum(далее любая
//последовательность букв/цифр) или contract(далее любая
//    последовательность букв/цифр).
//    Написать программу для чтения информации из входного файла - путь к
//    входному файлу должен задаваться через консоль.
//    Программа должна проверять номера документов на валидность.

    public static void main(String[] args) {

        //Create path to the document
        File path = new File("src/Documents/SomeDocNumbers.txt");
//        File path1 = new File(dir1, "SomeDocNumbers.txt");

        //Get file name
        System.out.println("\nA name of the document: " + path.getName());

        //Read the document

        try {
            Scanner docScan = new Scanner(path);
            String firstLine = docScan.nextLine();

            while (docScan.hasNext()) {
                System.out.println(docScan.nextLine());
            }
            System.out.println("\n**************************************\n" +
                    path.length());
            docScan.close();

        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }

    }
}


