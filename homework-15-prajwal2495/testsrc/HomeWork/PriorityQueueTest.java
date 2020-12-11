package HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueTest {

//enQueue, deQueue, size, peek
    @Test
    public void testEnQueue(){
        //setup
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.enQueue(10);
        priorityQueue.enQueue(20);
        priorityQueue.enQueue(30);
        priorityQueue.enQueue(1);

        //invoke
        int expected = 1;
        int actual = priorityQueue.peek();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void testDeQueue(){
        //setup
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.enQueue(10);
        priorityQueue.enQueue(20);
        priorityQueue.enQueue(30);
        priorityQueue.enQueue(1);


        //invoke
        int expected = 1;
        int actual =  priorityQueue.deQueue();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void testPeek(){
        //setup
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.enQueue(10);
        priorityQueue.enQueue(20);
        priorityQueue.enQueue(30);
        priorityQueue.enQueue(1);
        priorityQueue.deQueue();

        //invoke
        int expected = 10;
        int actual = priorityQueue.peek();

        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void testSize(){
        //setup
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.enQueue(10);
        priorityQueue.enQueue(20);
        priorityQueue.enQueue(30);
        priorityQueue.enQueue(1);
        priorityQueue.deQueue();

        //invoke
        int expected = 3;
        int actual = priorityQueue.size();

        //assert
        assertEquals(expected,actual);
    }

}