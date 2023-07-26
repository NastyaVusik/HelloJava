package FilesWithDocuments.newFiles;

import java.io.FileReader;
import java.util.Scanner;

public class GetScanner {

    //Method for Scanner calling
    static String enterFileInfo() {
        return new Scanner(System.in).nextLine();
    }


    //Overloaded method for Scanner calling
    static String enterFileInfo(FileReader reader) {
        return new Scanner(reader).nextLine();
    }
}
