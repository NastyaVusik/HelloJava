package IPAddress;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class MainIPAddress {
    public static void main(String[] args) {

        //Create object of class ConsoleReader
        ConsoleReader consoleReader = new ConsoleReader();

        System.out.print("Enter IP address: ");
        CheckIPAddress checkIPAddress = new CheckIPAddress(consoleReader.setConsoleReader());

        checkIPAddress.checkIP();

    }
}

