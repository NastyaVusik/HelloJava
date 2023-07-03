package ReadDocument.DocumentCheck;

import ReadDocument.Exceptions.Length15SymbolsException;
import ReadDocument.Exceptions.StartWithDocnumOrContractException;

public class CorrectDocument {
    String docNumber;

    //Method for checking, if length of document's number is less than 15
    public boolean checkLength() throws Length15SymbolsException {

        if ((docNumber.startsWith("docnum") && (docNumber.length() > 21)) | (docNumber.startsWith("contract") && (docNumber.length() > 23))) {
            throw new Length15SymbolsException("Length od the document's number is incorrect");

        } else {
            return true;
        }
    }


    //Method for checking prefix of document's number
    public boolean checkPrefix() throws StartWithDocnumOrContractException {
        if (docNumber.startsWith("docnum") | docNumber.startsWith("contract")) {
            return true;
        } else {
            throw new StartWithDocnumOrContractException("Prefix of the document's number is incorrect ");
        }
    }

}
