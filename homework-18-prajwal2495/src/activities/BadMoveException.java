package activities;

/**
 * @author Prajwal Krishna
 * Beginning of class BadMoveException
 */
public class BadMoveException extends Exception{

    /**
     * Constructor of Exception class
     * outputs a message depicting what went wring when the player made an illegal move
     * @param message
     */
    public BadMoveException(String message){
        super(message);
    }

}
