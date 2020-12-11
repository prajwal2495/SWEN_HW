package activities;

/**
 * @author Prajwal Krishna
 * Beginning of enum Piece
 */
public enum Piece {
    BLACK("B"),
    WHITE("W");

    protected final String symbol;

    /**
     * Enum constructor
     * used to initialise the symbol.
     * @param symbol, black or white piece
     */
    Piece(String symbol) {
        this.symbol = symbol;
    }

    /**
     * method getSymbol()
     * returns the current symbol of the particular Square object
     * @return symbol of the square
     */
    public String getSymbol(){
        return this.symbol;
    }

    /**
     * method flip()
     * used to flip the square symbol
     * @return An Enum Piece object
     */
    public Piece flip(){
        if(this == BLACK){
            return WHITE;
        }
        else{
            return BLACK;
        }
    }
}
