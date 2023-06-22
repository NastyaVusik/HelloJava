package Documents;

public class Register implements IFRegister {

    BaseDocuments[] documents;

    //Constructor with array, which contains all documents in register
    public Register() {
        documents = new BaseDocuments[10];

    }


    //Method for getting info about document by using docNumber

    @Override
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


    @Override
    //Method for saving a document in register
    public void saveDocument(BaseDocuments document) {
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
