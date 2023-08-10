package FileWithDocuments;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

public class MapCollection extends FileChecking {

    //Create object of class Document
    Document document = new Document();

    //Create Map collection
    private Map<String, Document> docMap = new TreeMap<>();

    //Create object of class Reader
    Reader reader = new Reader();


    //Create object of class FileChecking
    FileChecking fileChecking = new FileChecking();


    //Getter and Setters

    public Map<String, Document> getDocMap() {
        return docMap;
    }

    public void setDocMap(Map<String, Document> docMap) {
        this.docMap = docMap;
    }


//    //Specify quantity of checking files
//    public int getFileQuantity() {
//        System.out.print("\nEnter quantity of checking files: ");
//        int fileQuantity = reader.getIntScanner();
//
//        return fileQuantity;
//    }


    //Method for finding document's numbers from the files and filling collection
//    public Map fillMap(FileChecking fileChecking) {
//
////        //Read files in the folder
////        System.out.print("\nEnter path to the folder with files: ");
//        try {
//            reader.readWithBufferedReader();
//            if (fileChecking.findRegExInText(super.matcher)) {
//                docMap.put(document.getDocNumber(), document);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

}
