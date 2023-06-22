package Documents;

//import java.util.Date;

import java.time.LocalDate;

public abstract class BaseDocuments implements IFDocuments, IFRegister {
    protected String docType;
    protected int docNumber;
    //    protected Date docDate;
    protected LocalDate docDate;


    //Constructor by default
    public BaseDocuments() {
        docType = "Unknown";
        docNumber = 0;
        docDate = null;
    }


    //Constructor with parameters
    public BaseDocuments(String docType, int docNumber, LocalDate docDate) {
        this.docType = docType;
        this.docNumber = docNumber;
        this.docDate = docDate;
    }


    //Getters and Setters

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public int getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(int docNumber) {
        this.docNumber = docNumber;
    }


    public LocalDate getDocDate() {
        return docDate;
    }

    public void setDocDate(LocalDate date) {
        this.docDate = docDate;
    }

    public abstract String printInfo();

}

