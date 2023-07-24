package FilesWithDocuments.FilesCheck;

import FilesWithDocuments.Exceptions.DocNumberException;
import FilesWithDocuments.Exceptions.Length15SymbolsException;
import FilesWithDocuments.Exceptions.StartWithDocNumOrContractException;


public class DocumentCheck {

    //Method for checking, if length of document's number is less than 15
    public static boolean checkLength(String docNumber) throws Length15SymbolsException, DocNumberException {

        if ((docNumber.startsWith("docnum") && (docNumber.length() != 21)) | (docNumber.startsWith("contract") && (docNumber.length() != 23))) {
            throw new Length15SymbolsException("Length od the document's number is incorrect");
        } else if ((!(docNumber.startsWith("docnum")) && (docNumber.length() != 15)) | (!(docNumber.startsWith("contract")) && (docNumber.length() != 15))) {
            throw new Length15SymbolsException("Length of the document's number is incorrect");
        }
        return true;
    }


    //Method for checking prefix of document's number
    public static boolean checkPrefix(String docNumber) throws StartWithDocNumOrContractException {
        if (docNumber.startsWith("docnum") | docNumber.startsWith("contract")) {
            return true;
        } else {
            throw new StartWithDocNumOrContractException("Prefix of the document's number is incorrect ");
        }
    }

    //Method for checking unwanted symbols
    public static boolean checkPunctuationMarks(String docNumber) throws DocNumberException {
        char[] docNumberArr = docNumber.toCharArray();

//        System.out.println(Arrays.toString(docNumberArr));                //The array was printed for self-control

        for (int i = 1; i < docNumberArr.length; i++) {
            if ((!Character.isLetter(docNumberArr[i])) & (!Character.isDigit(docNumberArr[i]))) {
                throw new DocNumberException("The document's number contains punctuation marks");
            }
        }
        return true;
    }
}

