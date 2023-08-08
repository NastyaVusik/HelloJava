package FileWithDocuments;

import java.io.File;

public class FileChecking {

    //path variable for tests
//    String path = "src/FileWithDocuments/SecretFolder";

    //Create object of class Console reader
    ConsoleReader consoleReader = new ConsoleReader();
    String path = consoleReader.getStringScanner();

    //Create new File
    public void createFileTxt() {

        File file = new File(path);
    }
}
