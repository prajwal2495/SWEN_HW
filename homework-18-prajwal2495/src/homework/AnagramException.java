package homework;

/**
 * @author Prajwal Krishna
 * Beginning of class AnagramException
 */
public class AnagramException extends Exception {

    /**
     * Constructor AnagramException
     * @param message, An exception message
     * @param cause, A throwable cause
     */
    public AnagramException(String message, Throwable cause){
        super(message, cause);
    }

    /**
     * Constructor AnagramException overloaded
     * @param message, an Exception message
     */
    public AnagramException(String message) {
        super(message);
    }
}
