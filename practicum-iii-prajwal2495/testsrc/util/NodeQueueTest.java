package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeQueueTest {
    @Test
    void create() {
        Queue<String> queue = new NodeQueue<>();

        assertEquals(0, queue.size());
    }

    @Test
    void enqueueOne() {
        Queue<String> queue = new NodeQueue<>();


        queue.enqueue("123");

        assertEquals(1, queue.size());
    }

    @Test
    void enqueueOnePeek() {
        Queue<String> queue = new NodeQueue<>();
        String expected = "567";
        queue.enqueue(expected);

        String actual1 = queue.peek();
        String actual2 = queue.peek();

        assertEquals(1, queue.size());
        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
    }

    @Test
    void enqueueOneDequeue() {
        Queue<String> queue = new NodeQueue<>();
        String expected = "234";
        queue.enqueue(expected);

        String actual = queue.dequeue();

        assertEquals(0, queue.size());
        assertEquals(expected, actual);
    }

    @Test
    void pushTwoPeekPop() {
        Queue<String> queue = new NodeQueue<>();
        String[] expected = { "123", "234" };
        queue.enqueue(expected[0]);
        queue.enqueue(expected[1]);

        String actualPeek1 = queue.peek();
        String actualDequeue1 = queue.dequeue();
        String actualPeek2 = queue.peek();
        String actualDequeue2 = queue.dequeue();

        assertEquals(0, queue.size());
        assertEquals(expected[0], actualPeek1);
        assertEquals(expected[0], actualDequeue1);
        assertEquals(expected[1], actualPeek2);
        assertEquals(expected[1], actualDequeue2);
    }
}