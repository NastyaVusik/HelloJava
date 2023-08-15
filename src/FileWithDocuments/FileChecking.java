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
    Matcher docNumberMatcher;
    Matcher emailMatcher;
    Matcher phoneNumberMatcher;

    //Create object of document, which contain info: DocNumber, Email(not always), PhoneNumber(not always)
    Document document = new Document();

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
        docNumberMatcher = pattern.matcher(line);
        if (docNumberMatcher.find()) {
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
        emailMatcher = pattern.matcher(line);
        if (emailMatcher.find()) {
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
        phoneNumberMatcher = pattern.matcher(line);
        if (phoneNumberMatcher.find()) {
            return true;
        } else {
            return false;                               //"There are no any phone numbers or they aren't satisfy required regEx"
        }
    }


    //Method for finding new lines, which are satisfied to requirements of refEx
    public ArrayList<String> findRegexInText(List<String> lines) {

        //Create collection ArrayList docList to keep info about the document (DocNumber, Email, PhoneNumber)
        ArrayList<String> docList = new ArrayList<>();

        for (String line : lines) {

            if (checkDocNumber(line) == true) {
                String docNumber = docNumberMatcher.group();
                docList.add(docNumber);
            }
//
//            if (checkEmail(line) == true) {
//                String email = emailMatcher.group();
//                docList.add(email);
//            }
//
//            if (checkPhoneNumber(line) == true) {
//                String phoneNumber = phoneNumberMatcher.group();
//                docList.add(phoneNumber);
//
//            }
        }
        System.out.print("\nArray docList <String> for document's numbers\n " +
                docList + "\n");
//        return document;
        return docList;

    }


    //Method for creating documents from refEx in required quantity of files
    public Document getDocument(List<String> lines) {

//        boolean hasOldDocNumber = false;
//        boolean hasOldEmail = false;
//        boolean hasOldPhoneNumber = false;

        for (String line : lines) {

            if (checkDocNumber(line) == true) {
                String docNumber = docNumberMatcher.group();
                document.setDocNumber(docNumber);
            }


            if (checkEmail(line) == true) {
                String email = emailMatcher.group();
                document.setEmail(email);
            }

            if (checkPhoneNumber(line) == true) {
                String phoneNumber = phoneNumberMatcher.group();
                document.setPhoneNumber(phoneNumber);

            }
        }
        System.out.println("\nDocument: " + document);
        return document;

    }


}
