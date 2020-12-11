package activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * beginning of the test class PieceTest
 */
class PieceTest {

    /**
     * method testFlip()
     * used to test whether a flip on a legal square is performed or not
     * @throws BadMoveException, in case an illegal move has been made by the user this particular exception will be thrown
     */
    @Test
    public void testFlip() throws BadMoveException{
        //setup
        Square whiteSquare = new Square();
        whiteSquare.occupy(Piece.WHITE);

        //invoke and assert
       whiteSquare.flip();
       assertEquals(whiteSquare.toString(),"B");

    }

}