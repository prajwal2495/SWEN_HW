package HomeWork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * Beginning of class CalculatorTest
 * Helps in performing unit testing on the Calculator class and avoid any unnecessary bugs
 */

class CalculatorTest {

    /**
     * Method operationSingle
     * checks whether the result when an unknown operand is passed by the user
     */
    @Test
    void unknownOperator(){
        //setup
        String[] operators = {"*", "+", "//", "/", "%", "^", "**", "-"};
        Calculator calculator = new Calculator(operators);
        double[] operands = {1.0d,3.44d};
        double expected = -1;

        //invoke
        double actual = calculator.operandAndOperators("****",operands);

        //assert
        assertEquals(expected, actual);
    }

    /**
     * method calculateIntegerDivision
     * checks for the working of the class IntegerDivision
     * passes the right parameter and an array of operands and evaluates whether the result gaines is accurate or not
     */
    @Test
    void calculateIntegerDivision(){
        //setup
        String[] operators = {"*", "+", "//", "/", "%", "^", "**", "-"};
        Calculator calculator = new Calculator(operators);
        double[] operands = {12.0d,5.0d};
        double expected = 2;

        //invoke
        double actual = calculator.operandAndOperators("//",operands);

        //assert
        assertEquals(expected,actual);

    }

    /**
     * method calculateMultiply
     * checks for the working of the class Multiply
     * passes the right parameter and an array of operands and evaluates whether the result gaines is accurate or not
     */
    @Test
    void calculateMultiply(){
        //setup
        String[] operators = {"*", "+", "//", "/", "%", "^", "**", "-"};
        Calculator calculator = new Calculator(operators);
        double[] operands = {5.0d,5.0d};
        double expected = 25;

        //invoke
        double actual = calculator.operandAndOperators("*",operands);

        //assert
        assertEquals(expected,actual);

    }

    /**
     * method calculateAdd
     * checks for the working of the class Sum
     * passes the right parameter and an array of operands and evaluates whether the result gaines is accurate or not
     */
    @Test
    void calculateAdd(){
        //setup
        String[] operators = {"*", "+", "//", "/", "%", "^", "**", "-"};
        Calculator calculator = new Calculator(operators);
        double[] operands = {5.0d,5.0d};
        double expected = 10.0d;

        //invoke
        double actual = calculator.operandAndOperators("+",operands);

        //assert
        assertEquals(expected,actual);

    }

    /**
     * method calculateSubtract
     * checks for the working of the class Difference
     * passes the right parameter and an array of operands and evaluates whether the result gaines is accurate or not
     */
    @Test
    void calculateSubtract(){
        //setup
        String[] operators = {"*", "+", "//", "/", "%", "^", "**", "-"};
        Calculator calculator = new Calculator(operators);
        double[] operands = {5.0d,5.0d};
        double expected = 0.0d;

        //invoke
        double actual = calculator.operandAndOperators("-",operands);

        //assert
        assertEquals(expected,actual);

    }


    /**
     * method calculateModulo
     * checks for the working of the class Modulo
     * passes the right parameter and an array of operands and evaluates whether the result gaines is accurate or not
     */
    @Test
    void calculateModulo(){
        //setup
        String[] operators = {"*", "+", "//", "/", "%", "^", "**", "-"};
        Calculator calculator = new Calculator(operators);
        double[] operands = {5.0d,5.0d};
        double expected = 0.0d;

        //invoke
        double actual = calculator.operandAndOperators("%",operands);

        //assert
        assertEquals(expected,actual);

    }

    /**
     * method calculateExponent
     * checks for the working of the class Exponent
     * passes the right parameter and an array of operands and evaluates whether the result gaines is accurate or not
     */
    @Test
    void calculateExponent(){
        //setup
        String[] operators = {"*", "+", "//", "/", "%", "^", "**", "-"};
        Calculator calculator = new Calculator(operators);
        double[] operands = {5.0d,2.0d};
        double expected = 25.0d;

        //invoke
        double actual = calculator.operandAndOperators("^",operands);

        //assert
        assertEquals(expected,actual);

    }
}