package FileWithDocuments;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

public class MapCollection {

    //Create object of class Document
    Document document = new Document();

    //Create Map collection
    private Map<String, Document> docMap = new TreeMap<>();

    //Create object of class Reader
    Reader reader = new Reader();

    //Create object of class FileCreate
    FileCreate fileCreate = new FileCreate();


    //Create object of class FileChecking
    FileChecking fileChecking = new FileChecking();


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
        int quantity = fileCreate.enterFileQuantity();
        System.out.println("fileQuantity = " + fileCreate.fileQuantity);

        for (int i = 0; i <= quantity; i++) {
            File fileInfo = fileCreate.fileTxtList.get(i);
            try {
                List<String> lines = reader.readWithBufferedReader(fileInfo);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            fileChecking.findRegexInText();


            docMap.put(document.getDocNumber(), document);

        }
        return docMap;
    }
}
