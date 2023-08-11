package FileWithDocuments;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Readable {

    //Read from Scanner
    String getStringScanner();

    //Read from Scanner
    int getIntScanner();

    //Read from file
    List<String> readWithBufferedReader(File file) throws IOException;

}
