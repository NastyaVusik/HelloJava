package DocNumberWithExceptions;

public class BeginWith555Exception extends Exception {
    public BeginWith555Exception() {
        super();
    }

    @Override
    public String getMessage() {
//        return super.getMessage();
        return "Document number doesn't begin with 555";
    }

    @Override
    public String toString() {
        return "DocNumberWithExceptions.BeginWith555Exception { message = " + getMessage() + " }";
    }
}
