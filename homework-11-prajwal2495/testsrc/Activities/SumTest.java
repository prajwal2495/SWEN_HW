package Activities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * Beginning of class SumTest
 * Helps in performing unit testing on the Sum class and avoid any unnecessary bugs
 */

class SumTest {

    /**
     * Method operationSingle
     * checks whether the result of the operation when there is only one single operand is correct or not
     */
    @Test
    void operationSingle() {
        //setup
        Operation op = new Sum();
        double[] operand = {1.0d};
        double expected = 1.0d;

        //invoke
        double actual = op.operation(operand);

        //Assert
        assertEquals(expected, actual);
    }

    /**
     * Method operationZero
     * checks whether the result of the operation is correct or not when there is no operands present
     */
    @Test
    void operationZero(){
        //setup
        Operation op = new Sum();
        double[] operand = {};
        double expected = 0.0d;

        //invoke
        double actual = op.operation(operand);

        //assert
        assertEquals(expected, actual);

    }


    /**
     * Method operationMultiple
     * checks whether the result of the operation when there are multiple operands passed to perform the given calculation
     */
    @Test
    void operationMultiple(){
        //setup
        Operation op = new Sum();
        double[] operand = {1.0d, 2.3d, 2.0d};
        double expected = 5.3d;

        //invoke
        double actual = op.operation(operand);

        //assert
        assertEquals(expected, actual);
    }

    /**
     * Method matchesPlus
     * checks whether the Sum class is accepting proper operator type
     */
    @Test
    void matchesPlus(){
        //setup
        Operation op = new Sum();
        boolean expected = true;
        String operator = "+";

        //invoke
        boolean actual = op.matches(operator);

        //assert
        assertEquals(expected, actual);
    }

    /**
     * method matchesMinus
     * This is a negative testing where the method make sure that the Sum class is not considering wrong operators to perform any of its operation
     */
    @Test
    void matchesMinus(){
        //setup
        Operation op = new Sum();
        boolean expected = false;
        String operator = "-";

        //invoke
        boolean actual = op.matches(operator);

        //assert
        assertEquals(expected, actual);
    }

    /**
     * method matchesExponent
     * This is a negative testing where the method make sure that the Sum class is not considering wrong operators to perform any of its operation
     */
    @Test
    void matchesExponent(){
        //setup
        Operation op = new Sum();
        boolean expected = false;
        String operator = "**";

        //invoke
        boolean actual = op.matches(operator);

        //assert
        assertEquals(expected, actual);
    }
}