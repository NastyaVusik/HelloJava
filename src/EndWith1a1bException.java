public class EndWith1a1bException extends Exception {
    public EndWith1a1bException() {
        super();
    }

    @Override
    public String getMessage() {
//        return super.getMessage();
        return "Document number doesn't end with line \"1a1b\"";
    }

    @Override
    public String toString() {
        return "EndWith1a1bException { message = " + getMessage() + " }";
    }
}
