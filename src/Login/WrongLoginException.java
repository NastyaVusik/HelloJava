package Login;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongLoginException message = { " + getMessage() + " }\n";
    }
}
