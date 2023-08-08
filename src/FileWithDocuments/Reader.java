package FileWithDocuments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reader implements Readable {

    //Create object of class Scanner
    Scanner scanner = new Scanner(System.in);

    @Override
    public String getStringScanner() {
        return scanner.nextLine();
    }

    @Override
    public int getIntScanner() {
        return scanner.nextInt();
    }

    @Override
    //Read file
    public String readWithBufferedReader() throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(InputStream.nullInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            InputStream.nullInputStream().close();
        }
        return resultStringBuilder.toString();
    }
}
