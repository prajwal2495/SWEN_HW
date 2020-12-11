package activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * beginning of the test class SquareTest
 */
class SquareTest {

    /**
     * method testMoveOccupiedSquare()
     * used to test whether a BadMoveException is thrown upon moving on an occupied square
     * @throws BadMoveException, in case an illegal move has been made by the user this particular exception will be thrown
     */
    @Test
    public void testMoveOccupiedSquare() throws BadMoveException {
        //setup
        Square square = new Square();
        square.occupy(Piece.WHITE);

        //invoke and assert
        try {
            square.occupy(Piece.WHITE);
            fail("Exception should have been thrown");
        }
        catch(BadMoveException bme) {
            assertEquals("Cannot occupy an occupied square.",bme.getMessage());
        }

    }

    /**
     * method testFlipEmptySquare()
     * used to test whether a BadMoveException is thrown upon trying to flip on an empty square
     * @throws BadMoveException, in case an illegal move has been made by the user this particular exception will be thrown
     */
    @Test
    public void testFlipEmptySquare() throws BadMoveException{

        //setup
        Square square = new Square();

        //invoke and assert
        try{
            square.flip();
            fail("Exception should have been thrown");
        }
        catch (BadMoveException bme){
            assertEquals("Cannot flip empty square.",bme.getMessage());
        }
    }

}