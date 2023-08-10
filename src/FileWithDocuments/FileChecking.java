package FileWithDocuments;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileChecking {

    //Create object of class FileCreateAndRead
    FileCreateAndRead fileCreateAndRead = new FileCreateAndRead();

    //Create object of class Reader
    Reader reader = new Reader();
    Matcher matcher;

    private String regexDocNumber = "[0-9]{4}-[a-zA-Zа-яА-Я]{3}-[0-9]{4}-[a-zA-Zа-яА-Я]{3}-[0-9][a-zA-Zа-яА-Я][0-9][a-zA-Zа-яА-Я]";         //\d{4}-[a-zA-Zа-яА-Я]{3}-\d{4}-[a-zA-Zа-яА-Я]{3}-\d[a-zA-Zа-яА-Я][0-9][a-zA-Zа-яА-Я]
    private String regexEmail = "^(.+)@(.+)$";
    private String regexPhoneNumber = "\\+\\([0-9]{2}\\)[0-9]{7}";


    //Method for checking the document number
    public boolean checkDocNumber() {
        //Compile regEx
        Pattern pattern = Pattern.compile(regexDocNumber);

        //Find match between pattern ipRegex and the document number
        matcher = pattern.matcher(regexDocNumber);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }


    //Method for checking Email
    public boolean checkEmail() {
        //Compile regEx
        Pattern pattern = Pattern.compile(regexEmail);

        //Find match between pattern ipRegex and email
        matcher = pattern.matcher(regexEmail);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }


    //Method for checking phone number
    public boolean checkPhoneNumber() {
        //Compile regEx
        Pattern pattern = Pattern.compile(regexPhoneNumber);

        //Find match between pattern ipRegex and phone number
        matcher = pattern.matcher(regexPhoneNumber);
        if (matcher.matches()) {
            return true;
        } else {
            return false;                               //"There are no any phone numbers or they aren't satisfy required regEx"
        }
    }


    //Method for finding new lines, which are satisfied to requirements of refEx
    public ArrayList<Matcher> findRegexInText(Matcher matcher) {

        //Create collection ArrayList docList to keep info about the document (DocNumber, Email, PhoneNumber)
        ArrayList<Matcher> docList = new ArrayList<>();

        //Create object of document, which contain info: DocNumber, Email(not always), PhoneNumber(not always)
        Document document = new Document();

        if (checkDocNumber() == matcher.find()) {
            docList.add(matcher);
            document.setDocNumber(String.valueOf(matcher));             //matcher.group() better????????????????????????????
        }

        if (checkEmail() == matcher.find()) {
            docList.add(matcher);
            document.setEmail(String.valueOf(matcher));
        }

        if (checkPhoneNumber() == true) {
            docList.add(matcher);
            document.setPhoneNumber(String.valueOf(matcher));

        }
        return document;
//        return docList;

    }


}
