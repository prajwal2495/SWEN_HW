package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayHeapTest {
    @Test
    public void create() {
        Heap<String> heap = new ArrayHeap<>();

        assertEquals(0, heap.size());
    }

    @Test
    public void addOne() {
        Heap<String> heap = new ArrayHeap<>();

        heap.add("abc");

        assertEquals(1, heap.size());
    }

    @Test
    public void addOneRemoveOne() {
        Heap<String> heap = new ArrayHeap<>();
        String expected = "abc";

        heap.add(expected);

        String actual = heap.remove();

        assertEquals(0, heap.size());
        assertEquals(expected, actual);
    }

    @Test
    public void addTwoRemoveTwoInOrder() {
        Heap<String> heap = new ArrayHeap<>();
        String[] expected = {"abc", "def" };


        heap.add(expected[0]);
        heap.add(expected[1]);

        String[] actual = new String[2];
        actual[0] = heap.remove();
        actual[1] = heap.remove();

        assertEquals(0, heap.size());
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addTwoRemoveTwoNoOrder() {
        Heap<String> heap = new ArrayHeap<>();
        String[] expected = {"abc", "def" };


        heap.add(expected[1]);
        heap.add(expected[0]);

        String[] actual = new String[2];
        actual[0] = heap.remove();
        actual[1] = heap.remove();

        assertEquals(0, heap.size());
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addManyRemoveMany() {
        Heap<Integer> heap = new ArrayHeap<>();
        int number = 20;
        int[] expected = new int[number];
        for(int i=0; i<number; i++) {
            expected[i] = i+1;
        }

        for(int i=number; i>0; i--) {
            heap.add(expected[i-1]);
        }

        int[] actual = new int[number];
        for(int i=0; i<number; i++) {
            actual[i] = heap.remove();
        }

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addThreeWithComparator() {
        Heap<Integer> heap = new ArrayHeap<>((a, b) -> b - a);

        heap.add(1);
        heap.add(2);
        heap.add(3);
        heap.add(0);


        assertEquals(3, heap.remove());
        assertEquals(2, heap.remove());
        assertEquals(1, heap.remove());
        assertEquals(0, heap.remove());
    }

}