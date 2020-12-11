package HomeWork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * Beginning of class NodeStackTest extending the abstract class AbstractStackTest
 */
public class NodeStackTest extends AbstractStackTest{

    /**
     * Method makeStack()
     * Helps in creating a Stack of any type with the help of the Generic interface Stack
     * @return a Stack of type Stack
     */
    @Override
    public Stack<String> makeStack() {
        Stack<String> stringStack = new NodeStack<String>();
        return  stringStack;
    }


    /**
     * Method testPush()
     * Tests whether the elements are being added to the top of the Stack
     */
    @Test
    public void testPush(){
        Stack<String> str = makeStack();

        str.push("Hello");
        str.push("World");

        String expected = "World";
        String actual = str.peek();

        assertEquals(expected,actual);
    }

    /**
     * Method testPop()
     * Tests whether the correct element is being removed from the top of the Stack
     */
    @Test
    public void testPop(){
        Stack<String> str = makeStack();

        str.push("Hello");
        str.push("World");

        String expected = "World";
        String actual = str.pop();

        assertEquals(expected,actual);
    }

    /**
     * Method testSize()
     * Tests for the size of the queue after Push and Pop operations
     */
    @Test
    public void testSize(){
        Stack<String> str = makeStack();

        str.push("Hello");
        str.push("World");
        str.push("SWEN");

        int expected = 3;
        int actual = str.size();

        assertEquals(expected,actual);
    }

}