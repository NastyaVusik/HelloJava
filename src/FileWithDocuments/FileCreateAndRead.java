package FileWithDocuments;

import java.io.*;

public class FileCreateAndRead {
    //path variable for tests
//    String path = "src/FileWithDocuments/SecretFolder";

    //Create object of class Reader
    Readable reader = new Reader();


    //Create new File
    public void createFileTxt() {
        String answer = "y";

        while (answer.equals("y")) {
            System.out.print("\nEnter path to the file: ");
            String path = reader.getStringScanner();
            try {
                File file = new File(path);
                if (file.createNewFile()) {
                    System.out.println("\nNew file " + file.getName() + " with path " + file.getPath() + " was created.\n");
                } else {
                    System.out.println("\nFile with name " + file.getName() + " is already exist.\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print("\nDo you want to create a new file? Enter \"y\" - if Yes, \"n\" - if No: ");
            answer = reader.getStringScanner();
            if (answer.equals("y")) {
                continue;
            } else {
                break;
            }
        }

    }


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
