package FileWithDocuments;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
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
    //Method for reading file with BufferedReader reader
    public List<String> readWithBufferedReader(File file) throws IOException {
        List<String> resultList = new ArrayList<>();
        try (BufferedReader bufReader = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = bufReader.readLine()) != null) {
                resultList.add(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultList;
    }
}
