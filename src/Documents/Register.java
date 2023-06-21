package Documents;

public class Register {

    BaseDocuments[] documents;

    //Constructor with array, which contains all documents in register
    public Register() {
        documents = new BaseDocuments[10];             //I changed to BaseDocuments instead IFDocuments??????????????

    }


    //Method for getting info about document by using docNumber
    public String getDocInfo(int docNumber) {
        for (BaseDocuments doc : documents) {
            if (doc == null) {
                break;
            }

            if (docNumber == doc.getDocNumber()) {
                return doc.printInfo();
            }
        }
        return "The document isn't found";
    }


    //Method for saving a document in register
    public void saveDocument(BaseDocuments document) {          //???????????????????????????
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] == null) {
                documents[i] = document;
                return;
            } else if (documents[i].getDocNumber() == document.getDocNumber()) {
                System.out.println("Such document is already existed");
                return;
            }
        }
        System.out.println("Register is full. Document can't be added.");
    }

}
