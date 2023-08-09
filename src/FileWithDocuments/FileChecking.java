package FileWithDocuments;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileChecking {

    //Create object of class FileCreateAndRead
    FileCreateAndRead fileCreateAndRead = new FileCreateAndRead();

    //Create object of class Reader
    Reader reader = new Reader();

    private String regexDocNumber = "[0-9]{4}-[a-zA-Zа-яА-Я]{3}-[0-9]{4}-[a-zA-Zа-яА-Я]{3}-[0-9][a-zA-Zа-яА-Я][0-9][a-zA-Zа-яА-Я]";
    private String regexEmail = "^(.+)@(.+)$";
    private String regexPhoneNumber = "\\+\\([0-9]{2}\\)[0-9]{7}";


    //Method for checking the document number
    public boolean checkDocNumber() {
        //Compile regEx
        Pattern pattern = Pattern.compile(regexDocNumber);

        //Find match between pattern ipRegex and the document number
        Matcher matcher = pattern.matcher(regexDocNumber);
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
        Matcher matcher = pattern.matcher(regexEmail);
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
        Matcher matcher = pattern.matcher(regexPhoneNumber);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }


}
