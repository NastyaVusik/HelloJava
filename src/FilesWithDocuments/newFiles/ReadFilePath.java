package FilesWithDocuments.newFiles;

import java.io.File;
import java.util.ArrayList;


/*Existing files' path are moved to array with File type.
ArrayList collection is created from this array
 */
public class ReadFilePath {

    //Create collection ArrayList
    private ArrayList<File> filesList;


    //Method for addition file path and name to collection
    private ArrayList addFilePathToCollection() {
        File dir = new File("src/FilesWithDocuments/newFiles");
        File[] files = dir.listFiles();
        filesList = new ArrayList<>();

        for (File file : files) {
            filesList.add(file);
        }

        return filesList;
    }


    //Getters and Setter
    public ArrayList<File> getFilesList() {
        return filesList;
    }

    public void setFilesList(ArrayList<File> filesList) {
        this.filesList = filesList;
    }


}
