package ReadDocumentRewrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static ReadDocument.Document.MainFileWithDocNumbers.readDocInfoWithScanner;

import ReadDocument.Document.MainFileWithDocNumbers;
//import io.ReadDocument.xo.Document.MainFileWithDocNumbers;                        //???????????????????????????????????
//import io.ReadDocument.*;


public class MainRewrittenDocument {


//  Было сделано ранее в package ReadDocument
//   Допустим есть txt файл с номерами документов.
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


//    Улучшить предыдущее задание. А именно:
//    Валидные номера документов следует записать в один файл-отчет.
//    Невалидные номера документов следует записать в другой файл-отчет,
//    но после номеров документов следует добавить информацию о том,
//    почему этот документ невалиден.

    public static void main(String[] args) {

        System.out.print("\n*********************************************\n");

        //Create new files for document with correct numbers and document with incorrect numbers
        createFile();


        //Create object of class ReadDocument.Document.MainFileWithDocNumbers
        MainFileWithDocNumbers fileWithDocuments = new MainFileWithDocNumbers();

        fileWithDocuments.readDocInfoWithScanner();

    }


    //Create method for calling of scanner for entering path to documents
    static String enterFileInfo() {
        return new Scanner(System.in).nextLine();
    }


    //Method for creating a file
    static void createFile() {

//        Scanner scan = new Scanner(System.in);

        // Loop to create more than one file
        System.out.print("Enter index -  quantity of files you want to create: ");
        int index = Integer.parseInt(enterFileInfo());
//        int index = Integer.parseInt(scan.nextLine());
//        scan.close();

        for (int i = 0; i < index; i++) {

            System.out.print("\nEnter path to the file and file's name: ");
            String filePath = enterFileInfo();
            File newFile = new File(filePath);


            try {
                //Call integrated method for creating new files
                newFile.createNewFile();
                FileWriter writer = new FileWriter(newFile, true);

                System.out.println("Write a text to save in the document: ");
//                writer.write(enterFileInfo());
                writer.write(enterFileInfo());
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.getStackTrace();
                throw new RuntimeException(e);                              //?????????????????????????????????????
            }

            //Removing the file
            System.out.print("Do you want to delete this document? If YES, print y: ");
            if (enterFileInfo().equals("y")) {
                newFile.delete();
            }

        }
    }


}



