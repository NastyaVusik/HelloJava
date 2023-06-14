package Documents;

public abstract class Register {

    private String docType;
    private int docNumber;
    private Date docDate;


    //Constructor by default
    public Register() {
        docType = "Unknown";
        docNumber = 0;
        docDate = null;


    //Constructor with parameters
    public Register(String docType, int docNumber, Date docDate) {
        this.docType = docType;
        this.docNumber = docNumber;
        this.docDate = docDate;

    String[][] documents = new String[10][];

    //Method for saving a document in register
    public boolean saveDocument() {


        return true;
    }


    //Method for giving info about document
    public abstract String giveDocInfo();


}
