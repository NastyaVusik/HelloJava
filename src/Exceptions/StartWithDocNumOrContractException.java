package Exceptions;

public class StartWithDocNumOrContractException extends Exception {
    public StartWithDocNumOrContractException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "StartWithDocNumOrContractException { message = " + getMessage() + " }\n";
    }
}

