package ReadDocument.Exceptions;

public class DocNumberException extends Exception {
    public DocNumberException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "DocNumberException { message = " + getMessage() + " }\n";
    }
}
