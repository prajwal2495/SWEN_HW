package activities;

/**
 * @author Prajwal Krishna
 * Beginning of class Main
 */
public class Main {
    /**
     * Main method
     * used to occupy squares to start the game.
     * @param args
     * @throws BadMoveException, in case an illegal move has been made by the user this particular exception will be thrown
     */
    public static void main(String[] args) throws BadMoveException {
        Square square = new Square();
        //square.flip();
        square.occupy(Piece.BLACK);
        square.occupy(Piece.WHITE);
    }
}
