package FileWithDocuments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

public class MapCollection {

    //Create object of class Document
//    Document document = new Document();

    //Create Map collection
    private Map<String, Document> docMap = new TreeMap<>();

    //Create object of class Reader
    Reader reader = new Reader();


    //Create object of class FileChecking
//    FileChecking fileChecking = new FileChecking();


    //Create object of class FileCreate
    FileCreate fileCreate;

    public MapCollection(FileCreate fileCreate) {
        this.fileCreate = fileCreate;
    }


//    //Getter and Setters
//
//    public Map<String, Document> getDocMap() {
//        return docMap;
//    }
//
//    public void setDocMap(Map<String, Document> docMap) {
//        this.docMap = docMap;
//    }


    //Method for finding document's numbers from the files and filling collection
    public Map fillDocMap() {

//        //Read files in the folder
//        System.out.print("\nEnter path to the folder with files: ");

        int quantity = fileCreate.fileQuantity;
        FileChecking fileChecking = new FileChecking(fileCreate);

        for (int i = 0; i <= quantity; i++) {
            ArrayList<Document> documents = null;
            File fileInfo = fileCreate.fileTxtList.get(i);
            Document document = new Document();
            try {
                List<String> lines = reader.readWithBufferedReader(fileInfo);

                documents = fileChecking.findRegexInText(lines);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            for (Document document1 : documents) {
                docMap.put(document.getDocNumber(), document);

            }
        }
        return docMap;
    }
}
