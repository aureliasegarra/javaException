import java.io.IOException;

/**
 * an exception class BadDataException which inherits from IOException
 * which will be used for input data errors.
 */
public class BadDataException extends IOException {

    public BadDataException(){}

    public BadDataException(String message) { super(message); };

}
