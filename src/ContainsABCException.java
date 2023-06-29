public class ContainsABCException extends Exception {
    public ContainsABCException() {
        super();
    }

    @Override
    public String getMessage() {
//        return super.getMessage();
        return "Document number doesn't contain line \"abc\" with case ignore";
    }

    @Override
    public String toString() {
        return "ContainsABCException { message= " + getMessage() + " }";
    }

}
