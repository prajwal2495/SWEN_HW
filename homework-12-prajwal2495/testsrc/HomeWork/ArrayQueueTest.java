package HomeWork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * Beginning of class ArrayQueueTest extending the abstract class AbstractQueueTest
 */

class ArrayQueueTest extends AbstractQueueTest{

    /**
     * Method makeQueue()
     * Helps in creating a Queue of any type with the help of the Generic interface Queue
     * @return a Queue of type Queue
     */
    @Override
    public Queue makeQueue() {
        Queue<String> queue = new ArrayQueue(3);
        return queue;
    }


    /**
     * Method testEnqueue()
     * Tests whether the elements are being added to the Queue
     */
    @Override
    @Test
    public void testEnqueue() {
        Queue<String> str = makeQueue();

        String[] str1 = new String[5];

        str1[0] = "Hello";
        str1[1] = "World";

        str.enQueue(str1);

        String expected = "Hello";
        String actual = str.peek();

        assertEquals(expected,actual);
    }

    /**
     * Method testDequeue()
     * Tests whether the correct element is being removed from the Queue
     */
    @Override
    @Test
    public void testDequeue() {
        Queue<String> str = makeQueue();

        String[] str1 = new String[1];

        str1[0] = "Hello";
        //str1[1] = "World";

        str.enQueue(str1);


        Object actual = str.dequeue();
        String expected = "Hello";

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

        String[] str1 = new String[5];

        str1[0] = "Hello";
        str1[1] = "World";
        str1[2] = "How";
        str1[3] = "Are";
        str1[4] = "You";

        str.enQueue(str1);

        int expected = 6;
        int actual = ((ArrayQueue<?>) str).getLength();

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

        String[] str1 = new String[5];

        str1[0] = "Hello";
        str1[1] = "World";
        str1[2] = "How";
        str1[3] = "Are";
        str1[4] = "You";

        str.enQueue(str1);

        String expected = "Hello";
        Object actual = str.peek();

        assertEquals(expected,actual);
    }
}