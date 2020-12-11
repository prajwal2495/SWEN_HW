package HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * Beginning of class NodeQueueTest extending the abstract class AbstractQueueTest
 */
class NodeQueueTest extends AbstractQueueTest {

    /**
     * Method makeQueue()
     * Helps in creating a Queue of any type with the help of the Generic interface Queue
     * @return a Queue of type Queue
     */
    @Override
    public Queue makeQueue() {
        Queue<String> stringQueue = new NodeQueue<>();
        return stringQueue;
    }

    /**
     * Method testEnqueue()
     * Tests whether the elements are being added to the Queue
     */
    @Override
    @Test
    public void testEnqueue() {
        Queue<String> str = makeQueue();

        str.enQueue("Hello");
        str.enQueue("World");

        String expected = "Hello";
        String actual = str.peek();

        assertEquals(expected, actual);
    }


    /**
     * Method testDequeue()
     * Tests whether the correct element is being removed from the Queue
     */
    @Override
    @Test
    public void testDequeue() {
        Queue<String> str = makeQueue();

        str.enQueue("Hello");
        str.enQueue("World");

        String expected = "Hello";
        String actual = str.deQueue();

        assertEquals(expected,actual);
    }

    /**
     * Method testSize()
     * Tests for the size of the queue after enQueue and deQueue operations
     */
    @Override
    @Test
    public void testSize() {
        Queue<String> str = makeQueue();

        str.enQueue("Hello");
        str.enQueue("World");

        int expected = 2;
        int actual = str.size();

        assertEquals(expected,actual);
    }

    /**
     * Method testPeek()
     * Tests whether the correct element is being returned from the front of the Queue
     */
    @Override
    @Test
    public void testPeek() {
        Queue<String> str = makeQueue();

        str.enQueue("Hello");
        str.enQueue("World");

        String expected = "Hello";
        String actual = str.peek();

        assertEquals(expected,actual);
    }
}