package ReadDocument.Exceptions;

public class StartWithDocnumOrContractException extends Exception {
    public StartWithDocnumOrContractException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "StartWithDocnumOrContractException { message = " + getMessage() + " }";
    }
}
