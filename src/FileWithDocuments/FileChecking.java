package FileWithDocuments;

import java.io.File;

public class FileChecking {

    //Create object of class FileCreateAndRead
    FileCreateAndRead fileCreateAndRead = new FileCreateAndRead();

    //Create object of class Reader
    Reader reader = new Reader();

    //Specify quantity of checking files
    public int getFileQuantity() {
        System.out.print("\nEnter quantity of checking files: ");
        int fileQuantity = reader.getIntScanner();

        return fileQuantity;
    }


}
