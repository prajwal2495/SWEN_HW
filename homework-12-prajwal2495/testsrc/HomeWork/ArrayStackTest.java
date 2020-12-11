package HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * Beginning of class ArrayStackTest extending the abstract class AbstractStackTest
 */
public class ArrayStackTest extends AbstractStackTest{

    /**
     * Method makeStack()
     * Helps in creating a Stack of any type with the help of the Generic interface Stack
     * @return a Stack of type Stack
     */
    @Test
    public Stack makeStack() {
        Stack<String> arr = new ArrayStack(3);
        return arr;
    }


    /**
     * Method testPush()
     * Tests whether the elements are being added to the top of the Stack
     */
    @Test
    public void testPush() {
        Stack<String> str = makeStack();

        String[] str1 = new String[2];

        str1[0] = "Hello";
        str1[1] = "World";

        str.push(str1);

        String expected = "World";
        String actual = str.peek();

        assertEquals(expected,actual);
    }

    /**
     * Method testPop()
     * Tests whether the correct element is being removed from the top of the Stack
     */
    @Override
    @Test
    public void testPop() {
        Stack<String> str = makeStack();

        String[] str1 = new String[2];

        str1[0] = "Hello";
        str1[1] = "World";

        str.push(str1);

        String expected = "World";
        String actual = str.pop();

        assertEquals(expected,actual);
    }

    /**
     * Method testSize()
     * Tests for the size of the queue after Push and Pop operations
     */
    @Override
    @Test
    public void testSize() {
        Stack<String> str = makeStack();

        String[] str1 = new String[5];

        str1[0] = "Hello";
        str1[1] = "World";
        str1[2] = "How";
        str1[3] = "Are";
        str1[4] = "You";
        str.push(str1);

        int expected = 6;
        int actual = ((ArrayStack<?>) str).getLength();
        assertEquals(expected,actual);
    }
}