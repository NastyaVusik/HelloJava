package FilesWithDocuments.newFiles;

import FilesWithDocuments.Exceptions.DocNumberException;
import FilesWithDocuments.Exceptions.Length15SymbolsException;
import FilesWithDocuments.Exceptions.StartWithDocNumOrContractException;
import FilesWithDocuments.FilesCheck.DocumentCheck;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


/*Existing files' path are moved to array with File type.
ArrayList collection is created from this array
 */
public class ReadFilePath {

    //Create collection ArrayList
     private ArrayList<File> filesList;


    //Create collection HashSet
    private HashSet<String> docList;


    //Create variable filePath
    private String filePath;


    //Create variable fileDocNumbers
    private String fileDocNumbers;


    //Method for addition file path and name to collection
    public ArrayList addFilePathToCollection() {
        File dir = new File("src/FilesWithDocuments/newFiles");
        File[] files = dir.listFiles();
        filesList = new ArrayList<>();

        for (File file : files) {
            filesList.add(file);
        }
System.out.println();
        return filesList;
    }



    //Method for reading document's numbers from the files and saving them in collection HashSet
 public HashSet<String> readDocNumbers() throws IOException {

        //Create collection HashSet for keeping files' path and names
//        HashSet<String> docList = new HashSet<>();
        docList = new HashSet<>();

        try (FileReader reader = new FileReader(String.valueOf(filesList)) {

           for(int i = 0; i<filesList.size(); i++) {

                fileDocNumbers = String.valueOf(reader.read(filesList.get(i)));              //Read documents' numbers from all files
                docList.add(fileDocNumbers);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return docList;

    }



    //Method for reading document's numbers from the files and validating this numbers
    public HashMap writeResults() throws IOException {

        //Create variable for exceptions in document's numbers
        String docNumberException = "";

        //Create collection HashMap for keeping files' path and names
        HashMap<String, String> docResultsList = new HashMap<>();

        System.out.print("Enter path to the file Report and file's name: ");
        filePath = GetScanner.enterFileInfo();

        //Create File object
        File fileReport = new File(filePath);


        //Create new file for writing all unique document's numbers
        try (FileWriter writer = new FileWriter(fileReport, true); Scanner docScan = new Scanner(String.valueOf(docList))) {          //What have I do with this new scanner object?????????
            fileReport.createNewFile();

            while (docScan.hasNext()) {
    fileDocNumbers = docScan.nextLine();

                try {
                    DocumentCheck.checkLength(fileDocNumbers);

                } catch (Length15SymbolsException e) {
                    docNumberException = e.toString();
                } catch (DocNumberException e) {
                    docNumberException = e.toString();
                }

                try {
                    DocumentCheck.checkPrefix(fileDocNumbers);
                } catch (StartWithDocNumOrContractException e) {
                    docNumberException = e.toString();
                }

                try {
                    DocumentCheck.checkPunctuationMarks(fileDocNumbers);
                } catch (DocNumberException e) {
                    docNumberException = e.toString();

                }

            }


// Loop for writing report in the file with collection HashMap

            for (int i = 0; i < docList.size(); i++) {
                docResultsList.put(fileDocNumbers, docNumberException);
                writer.write(String.valueOf(fileReport));
            }

        } catch (IOException e) {
            e.getStackTrace();
        }
        return docResultsList;
    }


    //Getters and Setter
    public ArrayList<File> getFilesList() {
        return filesList;
    }

    public void setFilesList(ArrayList<File> filesList) {
        this.filesList = filesList;
    }


    public HashSet<String> getDocList() {
        return docList;
    }


    public void setDocList(HashSet<String> docList) {
        this.docList = docList;
    }


}
