public class DocNumberExceptions extends Exception {

    public DocNumberExceptions(String message) {
        super(message);
    }

    @Override
    public String toString() {

        return "DocNumberException { message= " + getMessage() + " }";
    }
}
