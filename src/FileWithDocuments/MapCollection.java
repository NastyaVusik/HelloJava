package FileWithDocuments;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {

    //Create object of class Document
    Document document = new Document();

    //Create Map collection
    private Map<String, Document> docList = new TreeMap<>();

    //Create object of class Reader
    Reader reader = new Reader();


    //Getter and Setters

    public Map<String, Document> getDocList() {
        return docList;
    }

    public void setDocList(Map<String, Document> docList) {
        this.docList = docList;
    }


    //Specify quantity of checking files
    public int getFileQuantity() {
        System.out.print("\nEnter quantity of checking files: ");
        int fileQuantity = reader.getIntScanner();

        return fileQuantity;
    }


    //Method for finding document's numbers from the files and filling collection
    public Map fillMap() {

        //Read files in the folder
        System.out.print("\nEnter path to the folder with files: ");
        try {
            reader.readWithBufferedReader();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
