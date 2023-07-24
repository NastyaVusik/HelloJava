package FilesWithDocuments.newFiles;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FilesReader {


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
//последовательность букв/цифр) или kontract(далее любая
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

        createFiles();
        System.out.println("\n\n*************************************************\n\n");

    }

    //Method for Scanner calling
    static String enterFileInfo() {
        return new Scanner(System.in).nextLine();
    }

    //Method for creating new files and putting them into ArrayList
    static void createFiles() throws IOException {

        //Create scanner for reading path to the file and file name
        Scanner readFilePath = new Scanner(System.in);

        //Create ArrayList for keeping files' path and names
        ArrayList<String> filesList = new ArrayList<>();

        //Create variable filePath
        String filePath;

        //Read file path and file name from the console before digit zero is entered
        while (true) {
            System.out.print("Enter path to the file and file's name: ");
            filePath = readFilePath.nextLine();

            if (filePath.equals("0")) {
                break;
            }

            filesList.add(filePath);                //Add file's path and name to the ArrayList

            File newFile = new File(filePath);

            try {

                newFile.createNewFile();

                FileWriter writer = new FileWriter(newFile, true);              //Create object writer to write document's numbers into the file
                System.out.print("Write a text to save in the document: ");
//                writer.write(String.valueOf(readFilePath));             //???????????????Why is valueOf required here?
                writer.write(enterFileInfo());             //???????????????Why is valueOf required here?

                writer.flush();
                writer.close();


            } catch (IOException e) {
                e.getStackTrace();
                throw new RuntimeException(e);
            }
        }
        readFilePath.close();
    }

    //Method for reading document's numbers from the files and validating this numbers
    static String readDocNumbers() {

        //Create collection HashSet for keeping files' path and names
        HashSet<String> docList = new HashSet<String>();

    }


}


