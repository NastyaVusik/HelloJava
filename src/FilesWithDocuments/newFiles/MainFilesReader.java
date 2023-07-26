package FilesWithDocuments.newFiles;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import FilesWithDocuments.Exceptions.DocNumberException;
import FilesWithDocuments.Exceptions.Length15SymbolsException;
import FilesWithDocuments.Exceptions.StartWithDocNumOrContractException;
import FilesWithDocuments.FilesCheck.DocumentCheck;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MainFilesReader {


//    Вернемся к домашнему заданию занятия номер 12 и модифицируем его.
//    Программа должна получать имена файлов с номерами документов с
//    консоли: каждая новая строка - это путь к файлу и имя файла.
//    Для завершения ввода списка файлов следует ввести 0.

//    После получения списка документов программа должна обработать
//    каждый документ: вычитать из файла номера документов и
//    провалидировать их.

//    В конце работы создать один файл отчет с выходной информаций: номер
//    документа - комментарий(валиден или не валиден и по какой причине).
//    Пусть каждый файл содержит каждый номер документа с новой строки и
//    в строке никакой другой информации, только номер документа.
//    Валидный номер документа должен иметь длину 15 символов и
//    начинаться с последовательности docnum(далее любая
//последовательность букв/цифр) или contract(далее любая
//    последовательность букв/цифр).
//    Учесть, что номера документов могут повторяться в пределах одного
//    файла и так же разные документы могут содержать одни и те же номера
//    документов.
//    Если номера документов повторяются, то повторные номера документов
//    не проверять, не валидировать.


//    Немного технических деталей

//1) Считать с консоли список документов: раз список - то это коллекции
//    типа List, никаких других условий нет - значит все имена файлов с
//    консоли сохраняем в структуру данных ArrayList.

//            2) Номера документов могут повторяться, но повторные документы
//    обрабатывать не надо и валидировать не надо,т.е. по сути дубликаты
//    нам не нужны - значит, надо считать номера документов из файлов и все
//    номера документов сохранять в коллекцию типа Set. Других условий нет,
//    значит можно использовать HashSet.

//            3) В конце должна быть структура номер документа - комментарий - т.е.
//    эта структура типа ключ-значений,значит это коллекция типа Map.
//    Других условий нет - значит, можно использовать HashMap. Создать
//    такую структуру и уже потом сделать цикл по этой структуре и записать
//    всю информацию из этой мапы в файл-отчет


    public static void main(String[] args) throws IOException {

        //Create object file for class ReadFilePath
        ReadFilePath file = new ReadFilePath();

        createFiles();
        System.out.print("\n\n*************************************************\n\n");

        System.out.println("Collection HashSet with unique document's numbers: ");
        System.out.print(file.readDocNumbers());
        System.out.print("\n\n*************************************************\n\n");

        System.out.println("Collection HashMap with unique document's numbers and comment for them: ");
        System.out.print(file.writeResults());
        System.out.print("\n\n*************************************************\n\n");

    }

//    //Create variable filePath                                      //Moved to class ReadFilePath
//    private static String filePath;

    //Create collection ArrayList
//    private static ArrayList<String> filesList;                        //Moved to class ReadFilePath

//    //Create collection HashSet                                      //Moved to class ReadFilePath
//    private static HashSet<String> docList;

//    //Create variable fileDocNumbers                                      //Moved to class ReadFilePath
//    private static String fileDocNumbers;


    //Method for creating new files and filling them with document's numbers
    static void createFiles() throws IOException {

        //Create ArrayList for keeping files' path and names
//        ArrayList<String> filesList = new ArrayList<>();
//        filesList = new ArrayList<>();                         //Moved to class ReadFilePath

        //Create variable filePath
//        String filePath;


        //Read file path and file name from the console before digit zero is entered
        while (true) {
            System.out.print("Enter path to the file and file's name: ");
            String filePath = GetScanner.enterFileInfo();

            if (filePath.equals("0")) {
                break;
            }

            //??????????????????????????????????filesList.add(filePath);                //Add file's path and name to the ArrayList

            File newFile = new File(filePath);

            try {

                newFile.createNewFile();

                FileWriter writer = new FileWriter(newFile, true);              //Create object writer to write document's numbers into the file
                System.out.print("Write a text to save in the document: ");

                writer.write(GetScanner.enterFileInfo());

                writer.flush();
                writer.close();


            } catch (IOException e) {
                e.getStackTrace();
                throw new RuntimeException(e);
            }
        }

    }


//    //Method for reading document's numbers from the files and saving them in collection Set              //Moved to class ReadFilePath
//    static HashSet<String> readDocNumbers() throws IOException {
//
//        //Create collection HashSet for keeping files' path and names
////        HashSet<String> docList = new HashSet<>();
//        docList = new HashSet<>();
//
//        try (FileReader reader = new FileReader(String.valueOf(ReadFilePath))) {
//
//            for (int i = 0; i < filesList.size(); i++) {
////                String fileDocNumbers = enterFileInfo();
//                String fileDocNumbers = String.valueOf(reader.read(filesList.get(i).toCharArray()));
//                docList.add(fileDocNumbers);
//            }
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//        return docList;
//
//    }


//    //Method for reading document's numbers from the files and validating this numbers                              //Moved to class ReadFilePath
//     HashMap writeResults() throws IOException {
//
//        //Create variable for exceptions in document's numbers
//        String docNumberException = "";
//
//        //Create collection HashMap for keeping files' path and names
//        HashMap<String, String> docResultsList = new HashMap<>();
//
//        System.out.print("Enter path to the file Report and file's name: ");
//        filePath = GetScanner.enterFileInfo();
//
//        //Create File object
//        File fileReport = new File(filePath);
//
//
//        //Create new file for writing all unique document's numbers
//        try (FileWriter writer = new FileWriter(fileReport, true); Scanner docScan = new Scanner(ReadFilePath.getDocList().toString())) {          //What have I do with this new scanner object?????????
//            fileReport.createNewFile();
//
//            while (docScan.hasNext()) {
////    String docNumber = docScan.nextLine();
//
//                try {
//                    DocumentCheck.checkLength(fileDocNumbers);
//
//                } catch (Length15SymbolsException e) {
//                    docNumberException = e.toString();
//                } catch (DocNumberException e) {
//                    docNumberException = e.toString();
//                }
//
//                try {
//                    DocumentCheck.checkPrefix(fileDocNumbers);
//                } catch (StartWithDocNumOrContractException e) {
//                    docNumberException = e.toString();
//                }
//
//                try {
//                    DocumentCheck.checkPunctuationMarks(fileDocNumbers);
//                } catch (DocNumberException e) {
//                    docNumberException = e.toString();
//
//                }
//
//            }
//
//
//// Loop for writing report in the file with collection HashMap
//
//            for (int i = 0; i < docList.size(); i++) {
//                docResultsList.put(fileDocNumbers, docNumberException);
//                writer.write(String.valueOf(fileReport));
//            }
//
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//        return docResultsList;
//    }


}


