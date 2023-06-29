public class DocNumberExceptions extends Exception {

    public DocNumberExceptions() {
        super();
    }

    @Override
    public String getMessage() {
//        return super.getMessage();
        return "Document number isn't correspond with required format";
    }

    @Override
    public String toString() {

        return "DocNumberException { message= " + getMessage() + " }";
    }
}
