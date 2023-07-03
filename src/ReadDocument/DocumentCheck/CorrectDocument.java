package ReadDocument.DocumentCheck;

import ReadDocument.Exceptions.DocNumberException;
import ReadDocument.Exceptions.Length15SymbolsException;
import ReadDocument.Exceptions.StartWithDocnumOrContractException;

public class CorrectDocument {

    //Method for checking, if length of document's number is less than 15
    public static boolean checkLength(String docNumber) throws Length15SymbolsException {

        if ((docNumber.startsWith("docnum") && (docNumber.length() > 21)) | (docNumber.startsWith("contract") && (docNumber.length() > 23))) {
            throw new Length15SymbolsException("Length od the document's number is incorrect");

        } else {
            return true;
        }
    }


    //Method for checking prefix of document's number
    public static boolean checkPrefix(String docNumber) throws StartWithDocnumOrContractException {
        if (docNumber.startsWith("docnum") | docNumber.startsWith("contract")) {
            return true;
        } else {
            throw new StartWithDocnumOrContractException("Prefix of the document's number is incorrect ");
        }
    }

    //Method for checking unwanted symbols
    public static boolean checkPunctuationMarks(String docNumber) throws DocNumberException {
        docNumber.toCharArray();
        for (int i = 0; i < docNumber.length(); i++) {
            if ((Character.isLetter(docNumber.charAt(i))) | (Character.isDigit(docNumber.charAt(i)))) {
                return true;
            } else {
                throw new DocNumberException("The document's number contains punctuation marks");
            }

        }
        return false;
    }
}

