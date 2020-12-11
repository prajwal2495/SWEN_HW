package activities;

/**
 * @author Prajwal Krishna
 * Beginning of class Square
 */
public class Square {
    private Piece piece;

    /**
     * Constructor Square()
     * initialises the piece to null
     */
    public Square(){
        this.piece = null;
    }

    /**
     * method isOccupied()
     * @return boolean value indicating whether a particular square is occupied or not
     */
    public boolean isOccupied(){
        return this.piece!=null;
    }

    /**
     * method occupy
     * occupies are square on the board if not already occupied
     * @param piece, An Enum object
     * @throws BadMoveException, in case an illegal move has been made by the user this particular exception will be thrown
     */
    public void occupy(Piece piece) throws BadMoveException{
        if(isOccupied()){
            throw new BadMoveException("Cannot occupy an occupied square.");
        }
        this.piece = piece;
    }

    /**
     * method flip()
     * used to flip the square symbol
     * @throws BadMoveException, in case an illegal move has been made by the user this particular exception will be thrown
     */
    public void flip() throws BadMoveException{
        if(this.piece == null){
            throw new BadMoveException("Cannot flip empty square.");
        }
        else {
            this.piece = piece.flip();
        }
    }

    /**
     * method toString
     * @return a String indicating the color of the square
     */
    @Override
    public String toString(){
        return piece != null ? piece.getSymbol() : " ";
    }
}
