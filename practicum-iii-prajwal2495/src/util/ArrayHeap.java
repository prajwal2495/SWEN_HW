package util;

import java.util.Arrays;
import java.util.Comparator;

/**
 * A generic, array-based implementation of a heap.
 *
 * @param <T> The generic type parameter.
 */
public class ArrayHeap<T> implements Heap<T> {
    /**
     * Used to compare values in the heap.
     */
    private Comparator<T> comparator;

    /**
     * The array that holds the values in the heap.
     */
    private T[] array;

    /**
     * The number of values in the heap.
     */
    private int size;

    /**
     * Creates a new heap that uses the specified comparator to determine
     * priority.
     *
     * @param comparator The comparator used to determine priority.
     */
    public ArrayHeap(Comparator<T> comparator) {
        this.comparator = comparator;
        array = (T[])new Object[8];
        size = 0;
    }

    /**
     * Creates a new heap without a comparator. If the elements are not
     * naturally comparable, using the heap will cause an exception.
     */
    public ArrayHeap() {
        this(null);
    }


    @Override
    public void add(T value) {
        if(array.length == size) {
            array = Arrays.copyOf(array, size*2);
        }
        array[size] = value;
        siftUp(size);
        size++;
    }

    @Override
    public T remove() {
        T value = array[0];
        size--;
        swap(size, 0);
        array[size] = null;
        siftDown(size);
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Sifts a value up from the specified index in a heap.
     *
     * @param index The index to begin sifting up.
     */
    private void siftUp(int index) {
        int parent = (index - 1) / 2;
        while(compare(array[parent], array[index]) > 0) {
            swap(index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    /**
     * Sifts a value down from the root in a heap.
     *
     * @param size The size of the heap.
     */
    private void siftDown(int size) {
        int to = 0;
        int from;
        do {
            from = to;

            int left = 2 * from + 1;
            int right = left + 1;
            if(left < size && compare(array[left], array[to]) < 0) {
                to = left;
            }

            if(right < size && compare(array[right], array[to]) < 0) {
                to = right;
            }

            swap(from, to);

        } while(from != to);
    }

    /**
     * Swaps the values at the specified indexes.
     *
     * @param from The first index.
     * @param to The second index.
     */
    private void swap(int from, int to) {
        if(from != to) {
            T tmp = array[from];
            array[from] = array[to];
            array[to] = tmp;
        }
    }

    private int compare(T a, T b) {
        if(comparator != null) {
            return comparator.compare(a, b);
        } else {
            Comparable<T> comparableA = (Comparable<T>)a;
            return comparableA.compareTo(b);
        }
    }
}
