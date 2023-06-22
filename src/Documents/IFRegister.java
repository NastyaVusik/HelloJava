package Documents;

public interface IFRegister {

    //Methods by default for class Register
    default public String getDocInfo(int docNumber) {
        return null;
    }

    default public void saveDocument(BaseDocuments document) {
        System.out.println("This document was saved in the Register successfully");
    }
}
