package FileWithDocuments;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCreate {
    //path variable for tests
//    String path = "src/FileWithDocuments/SecretFolder";

    //Create object of class Reader
    Readable reader = new Reader();

    //Variable for keeping a path to the folder with files
    String path;

    //Declare list for keeping all txt files in the folder
    List<File> fileTxtList = new ArrayList<>();

    //Variable of quantity of verified files
    int fileQuantity;


    //Create new File
    public void createFileTxt() {
        String answer = "y";


        while (answer.equals("y")) {
            System.out.print("\nEnter path to the file or \"q\" - if you don't want to create a new file in the folder: ");
            path = reader.getStringScanner();
            if (path.equals("q")) {
                break;
            }
            if (path.startsWith("src/")) {
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


    }


    //Method for creating file's List from txt files
    public List<File> createFileTxtList() {
        System.out.print("\nEnter path to required folder with files: ");                     //?????????????How to take path from previous method????????
        path = reader.getStringScanner();

        //Creating a File object for directory
        File files = new File(path);


        //Fill List of all files and directories
//        fileTxtList = new ArrayList<>();

        for (File file : files.listFiles()) {
            if (file.toString().endsWith(".txt")) {

                fileTxtList.add(file);
            }
        }

//        fileTxtList.forEach(System.out::println);
        System.out.print("\nSize of file.txt List: " + fileTxtList.size() + "\n");
        System.out.println("\nList of files.txt in required directory:");
        return fileTxtList;
    }


    //Specify quantity of checking files
    public int enterFileQuantity() {
        System.out.print("\nEnter quantity of checking files: ");
        int fileQuantity = reader.getIntScanner();
        reader.getStringScanner();

        if (fileQuantity > fileTxtList.size()) {
            fileQuantity = fileTxtList.size();

            System.out.print("Real quantity of checking files: " + fileQuantity);
//            return fileQuantity;
        }
        System.out.print("Real quantity of checking files: " + fileQuantity);
        return fileQuantity;
    }


    //    //Method for reading file
//    public String readWithBufferedReader() throws IOException {
//        StringBuilder resultStringBuilder = new StringBuilder();
//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(InputStream.nullInputStream()));
//            String line;
//            while ((line = br.readLine()) != null) {
//                resultStringBuilder.append(line).append("\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            InputStream.nullInputStream().close();
//        }
//        return resultStringBuilder.toString();
//    }
}
