package FileWithDocuments;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCreate {
    //Variable for keeping a path to the folder with files
    String path;

    //Variable of quantity of verified files
    int fileQuantity;


    //Create object of class Reader
    Readable reader = new Reader();

    //Declare list for keeping all txt files in the folder
    List<File> fileTxtList;

    public FileCreate(String path, int fileQuantity) {
        this.path = path;
        this.fileQuantity = fileQuantity;
    }


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

        //Creating a File object for directory
        File filesDir = new File(path);
        File[] files = filesDir.listFiles();

        //Fill List of all files and directories
        fileTxtList = new ArrayList<>();

        for (File file : files) {
            if (file.getPath().endsWith(".txt")) {

                fileTxtList.add(file);
            }
        }

        System.out.print("\nSize of file.txt List: " + fileTxtList.size() + "\n");
        System.out.println("\nList of files.txt in required directory:\n" + fileTxtList.toString());
        return fileTxtList;
    }


    //Specify quantity of checking files
    public int getFileQuantity(List<File> fileTxtList) {

        System.out.println("\nfileTxtList.size() = " + fileTxtList.size() + "\n");
        if (fileQuantity > fileTxtList.size()) {
            fileQuantity = fileTxtList.size();

            System.out.print("Real quantity of checking files: ");
            return fileQuantity;
        }
        System.out.print("Real quantity of checking files: ");
        return fileQuantity;
    }
}



