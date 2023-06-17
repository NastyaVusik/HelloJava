package Documents;

public class Register extends BaseDocuments{

//    private String docType;
//    private int docNumber;
//    private Date docDate;

//
//    //Constructor by default
//    public Register() {
//        docType = "Unknown";
//        docNumber = 0;
//        docDate = null;

//
//    //Constructor with parameters
//    public Register(String docType, int docNumber, Date docDate) {
//        this.docType = docType;
//        this.docNumber = docNumber;
//        this.docDate = docDate;
//
//
//        //Getters
//           public String getdocType(){
//               return docType;
//            }


            //What about getters ?????????????????????????????????????????



//Array, which contains all documents in register
    IFDocument [] documents = new IFDocument[10];

    public void fillDocuments() {
        for (int i = 0; i < documents.length; i++) {
documents[i] = documents.setDocNumber();
        }
    }


    //Overrided method from class BaseDocument
    @Override
    public String printInfo(){
      return documents.printInfo();
    }

    //Method for saving a document in register
    public void saveDocument(IFDocument documents) {


    }


    //Method for giving info about document
    public String giveDocInfo(int docNumber);


}

    private void getdocType() {
    }