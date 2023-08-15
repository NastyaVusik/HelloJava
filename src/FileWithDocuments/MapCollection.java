package FileWithDocuments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

public class MapCollection {

    //Create Map collection
    private Map<String, Document> docMap = new TreeMap<>();

    //Create object of class Reader
    Reader reader = new Reader();

    //Create object of class FileCreate
    FileCreate fileCreate;

    public MapCollection(FileCreate fileCreate) {
        this.fileCreate = fileCreate;
    }


    //Method for finding document's numbers from the files and filling collection
    public Map<String, Document> fillDocMap() {

//        //Read files in the folder
//        System.out.print("\nEnter path to the folder with files: ");

        int quantity = fileCreate.fileQuantity;
        FileChecking fileChecking = new FileChecking(fileCreate);

        for (int i = 0; i <= quantity; i++) {
            ArrayList<String> docList;
            File filePath = fileCreate.fileTxtList.get(i);
            Document document = new Document();
            try {
                List<String> lines = reader.readWithBufferedReader(filePath);

                docList = fileChecking.findRegexInText(lines);
                document = fileChecking.getDocument(lines);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            for (String fileName : docList) {
                fileName = filePath.getName().substring(0, filePath.getName().lastIndexOf("."));
                docMap.put(fileName, fileChecking.document);

            }
        }
        return docMap;
    }
}
