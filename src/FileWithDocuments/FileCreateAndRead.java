package FileWithDocuments;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FileCreateAndRead {
    //path variable for tests
//    String path = "src/FileWithDocuments/SecretFolder";

    //Create object of class Reader
    Readable reader = new Reader();
    String path;
    int fileCount;


    //Create new File
    public void createFileTxt() {
        String answer = "y";

        while (answer.equals("y")) {
            System.out.print("\nEnter path to the file or \"q\" - if you don't want to create a new file in the folder: ");
            path = reader.getStringScanner();
            if (path.equals("q")) {
                break;
            } else {
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
    public List<String> createFileTxtList() {
        System.out.print("\nEnter path to required folder with files: ");                     //?????????????How to take path from previous method????????
        String pathFolder = reader.getStringScanner();

        //Creating a File object for directory
        File file = new File(pathFolder);

        //List of all files and directories
        List<String> fileTxtList = new ArrayList<>();
        for (String file1 : fileTxtList.stream().toList()) {
            if (file1.endsWith(".txt")) {
                fileTxtList.add(file1.toString());
            }
        }

        fileTxtList.forEach(System.out::println);
        return fileTxtList;
    }

//        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(path))) {
//            for (Path path1 : stream) {
//                if (!Files.isDirectory(path1)) {
//                    fileTxtList.add(path1.toFile());
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        fileTxtList.forEach(System.out::println);
//        return fileTxtList;
//    }


    //Specify quantity of checking files
    public int getFileQuantity() {
        System.out.print("\nEnter quantity of checking files: ");
        int fileQuantity = reader.getIntScanner();

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
