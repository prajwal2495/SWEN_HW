package HomeWork;

import Activities.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * Beginning of class ExponentTest
 * Helps in performing unit testing on the Exponent class and avoid any unnecessary bugs
 */

class ExponentTest {

    /**
     * Method operationSingle
     * checks whether the result of the operation when there is only one single operand is correct or not
     */
    @Test
    void operationSingle(){
        //setup
        Operation op = new Exponent();
        double[] operand = {1.0d};
        double expected = 1.0d;

        //invoke
        double actual = op.operation(operand);

        //Assert
        assertEquals(expected,actual);
    }

    /**
     * Method operationMultiple
     * checks whether the result of the operation when there are multiple operands passed to perform the given calculation
     */
    @Test
    void operationMultiple(){
        //setup
        Operation op = new Exponent();
        double[] operand = {2.0d,3.0d,2.0d};
        double expected = 64.0d;

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
        Operation op = new Exponent();
        double[] operand = {};
        double expected = 0.0d;

        //invoke
        double actual = op.operation(operand);

        //assert
        assertEquals(expected, actual);
    }

    /**
     * method matchesPlus
     * This is a negative testing where the method make sure that the Exponent class is not considering wrong operators to perform any of its operation
     */
    @Test
    void matchesPlus(){
        //setup
        Operation op = new Exponent();
        boolean expected = false;
        String operator = "+";

        //invoke
        boolean actual = op.matches(operator);

        //assert
        assertEquals(expected, actual);
    }

    /**
     * method matchesMinus
     * This is a negative testing where the method make sure that the Exponent class is not considering wrong operators to perform any of its operation
     */
    @Test
    void matchesMinus(){
        //setup
        Operation op = new Exponent();
        boolean expected = false;
        String operator = "-";

        //invoke
        boolean actual = op.matches(operator);

        //assert
        assertEquals(expected, actual);
    }

    /**
     * method matchesAsterisk
     * This is a negative testing where the method make sure that the Exponent class is not considering wrong operators to perform any of its operation
     */
    @Test
    void matchesAsterisk(){
        //setup
        Operation op = new Exponent();
        boolean expected = false;
        String operator = "*";

        //invoke
        boolean actual = op.matches(operator);

        //assert
        assertEquals(expected, actual);
    }

    /**
     * Method matchesExponent
     * checks whether the Exponent class is accepting proper operator type
     */
    @Test
    void matchesExponent(){
        //setup
        Operation op = new Exponent();
        boolean expected = true;
        String operator1 = "**";
        String operator2 = "^";

        //invoke
        boolean actual = op.matches(operator1, operator2);

        //assert
        assertEquals(expected, actual);
    }


}