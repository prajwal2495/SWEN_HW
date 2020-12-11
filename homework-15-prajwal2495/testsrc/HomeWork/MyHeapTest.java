package HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHeapTest<T> {

    @Test
    public void testAdd(){
        //setup
        MyHeap<Integer> myHeap = new MyHeap<>();
        myHeap.add(20);
        myHeap.add(30);
        myHeap.add(1);
        myHeap.add(12);

        //invoke
        int expected = 4;
        int actual = myHeap.size();

        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){
        //setup
        MyHeap<Integer> myHeap = new MyHeap<>();
        myHeap.add(10);
        myHeap.add(56);
        myHeap.add(3);

        //invoke
        int expected = 3;
        int actual = myHeap.remove();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void testSize(){
        //setup
        MyHeap<Integer> myHeap = new MyHeap<>();
        myHeap.add(1);
        myHeap.add(2);
        myHeap.remove();
        myHeap.remove();

        //invoke
        int expected = 0;
        int actual = myHeap.size();

        //assert
        assertEquals(expected, actual);

    }

    @Test
    public void testLengthIncrease(){
        //setup
        MyHeap<Integer> myHeap = new MyHeap<>();
        myHeap.add(20);
        myHeap.add(30);
        myHeap.add(1);
        myHeap.add(12);
        myHeap.add(440);
        myHeap.add(110);
        myHeap.add(2);
        myHeap.add(4);
        myHeap.add(6);

        //invoke
        int expected = 16;
        int actual = myHeap.array.length;

        //assert
        assertEquals(expected, actual);

    }

}