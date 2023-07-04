package ReadDocument.Document;

import ReadDocument.DocumentCheck.CorrectDocument;
import ReadDocument.DocumentCheck.CorrectDocument;
import ReadDocument.Exceptions.DocNumberException;
import ReadDocument.Exceptions.Length15SymbolsException;
import ReadDocument.Exceptions.StartWithDocnumOrContractException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainFileWithDocNumbers {

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
        readDocInfoWithScanner();
//        System.out.println("\n\n*************************************************\n\n");
//        readDocInfoWithFileReader();
    }

    static void readDocInfoWithScanner() {

        //Create scanner for read a path to the document
        Scanner readDocPath = new Scanner(System.in);

        System.out.print("Enter a path to the document: ");
        String docPath = readDocPath.nextLine();

        File path = new File(docPath);


        //Get file name
        System.out.println("\nA name of the document: " + path.getName() + "\n\n");
        readDocPath.close();

        //Read the document

        try (Scanner docScan = new Scanner(path)) {

            while (docScan.hasNext()) {
                String docStr = docScan.nextLine();
                System.out.println(docStr);

                try {
                    CorrectDocument.checkLength(docStr);
                } catch (Length15SymbolsException e) {
                    System.out.println(e);
                } catch (DocNumberException e) {
                    throw new RuntimeException(e);
                }

                try {
                    CorrectDocument.checkPrefix(docStr);
                } catch (StartWithDocnumOrContractException e) {
                    System.out.println(e);
                }

                try {
                    CorrectDocument.checkPunctuationMarks(docStr);
                } catch (DocNumberException e) {
                    System.out.println(e);
                }
                System.out.println("**************************************\n");
            }

        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }

    }


//    static void readDocInfoWithFileReader() {
//        //Create scanner for read a path to the document
//        Scanner readDocPath = new Scanner(System.in);
//
//        System.out.print("Enter a path to the document: ");
//        String docPath = readDocPath.nextLine();
//
//        File path = new File(docPath);
//
//
//        //Get file name
//        System.out.println("File name: " + path.getName() + ", \n" +
//                "File path: " + path.getPath() + "\n");
//
//        //Addition variable to read information from the document
//        int character;
//
//
//        //Read the document
//        try (FileReader fileReader = new FileReader(path)) {
//            while ((character = fileReader.read()) != -1) {
//                System.out.print((char) character);
//            }
//
//        } catch (FileNotFoundException e) {
//            e.getStackTrace();
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//
//    }


}


