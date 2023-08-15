package FileWithDocuments;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileChecking {

    //Create object of class FileCreate
    FileCreate fileCreate;

    //Create object of class Reader
    Reader reader = new Reader();
    Matcher matcher;

    private String regexDocNumber = "[0-9]{4}-[a-zA-Zа-яА-Я]{3}-[0-9]{4}-[a-zA-Zа-яА-Я]{3}-[0-9][a-zA-Zа-яА-Я][0-9][a-zA-Zа-яА-Я]";         //\d{4}-[a-zA-Zа-яА-Я]{3}-\d{4}-[a-zA-Zа-яА-Я]{3}-\d[a-zA-Zа-яА-Я][0-9][a-zA-Zа-яА-Я]
    private String regexEmail = "^(.+)@(.+)$";
    private String regexPhoneNumber = "\\+\\([0-9]{2}\\)[0-9]{7}";


    public FileChecking(FileCreate fileCreate) {
        this.fileCreate = fileCreate;
    }

    //Method for checking the document number
    public boolean checkDocNumber(String line) {
        //Compile regEx
        Pattern pattern = Pattern.compile(regexDocNumber);

        //Find match between pattern ipRegex and the document number
        matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }


    //Method for checking Email
    public boolean checkEmail(String line) {
        //Compile regEx
        Pattern pattern = Pattern.compile(regexEmail);

        //Find match between pattern ipRegex and email
        matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }


    //Method for checking phone number
    public boolean checkPhoneNumber(String line) {
        //Compile regEx
        Pattern pattern = Pattern.compile(regexPhoneNumber);

        //Find match between pattern ipRegex and phone number
        matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return true;
        } else {
            return false;                               //"There are no any phone numbers or they aren't satisfy required regEx"
        }
    }


    //Method for finding new lines, which are satisfied to requirements of refEx
    public ArrayList<Document> findRegexInText(List<String> lines) {

        //Create collection ArrayList docList to keep info about the document (DocNumber, Email, PhoneNumber)
        ArrayList<Document> docList = new ArrayList<>();

        //Create object of document, which contain info: DocNumber, Email(not always), PhoneNumber(not always)
        Document document = new Document();

//        boolean hasOldDocNumber = false;
//        boolean hasOldEmail = false;
//        boolean hasOldPhoneNumber = false;

        for (String line : lines) {

            if (checkDocNumber(line) == true) {


                docList.add(document.setDocNumber(line));


                document.setDocNumber(String.valueOf(matcher));             //matcher.group() better????????????????????????????

            }

            if (checkEmail(line) == true) {
                if (hasOldEmail == true) {
                    document.setEmail(String.valueOf(matcher));
//                    docList.add(matcher);
                }
            }

            if (checkPhoneNumber(line) == true) {
                if (hasOldPhoneNumber == true) {
//                    docList.add(document.setPhoneNumber(line));
                    document.setPhoneNumber(String.valueOf(matcher));
                } else {
                    System.out.print("\n\n");
                }

            }
            System.out.print("\nArray List< Document >:\n " + docList);
        }
//        return document;
        return docList;

    }


}
