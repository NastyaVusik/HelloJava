package FileWithDocuments;

import java.io.IOException;

public interface Readable {

    //Read from Scanner
    String getStringScanner();

    //Read from Scanner
    int getIntScanner();

    //Read from file
    String readWithBufferedReader() throws IOException;

}
