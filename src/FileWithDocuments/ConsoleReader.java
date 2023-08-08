package FileWithDocuments;

import java.util.Scanner;

public class ConsoleReader implements Readeble {

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
}
