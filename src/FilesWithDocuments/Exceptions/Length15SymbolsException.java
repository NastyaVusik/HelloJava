package FilesWithDocuments.Exceptions;

public class Length15SymbolsException extends Exception {
    public Length15SymbolsException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Length15SymbolsException { message = " + getMessage() + " }\n";
    }
}
