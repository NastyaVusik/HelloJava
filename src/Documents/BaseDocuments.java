package Documents;

import java.util.Date;

public abstract class BaseDocuments implements IFDocuments {
    protected String docType;                  //?????????????????????????????????????
    protected int docNumber;
    protected Date docDate;
    protected String str;


    //Constructor by default
    public BaseDocuments() {
        docType = "Unknown";
        docNumber = 0;
        docDate = null;
    }


    //Constructor with parameters
    public BaseDocuments(String docType, int docNumber, Date docDate) {
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


    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date date) {
        this.docDate = docDate;
    }

    public abstract String printInfo();

    public abstract String getDocInfo;          //??????????????????????????????

}

