package util;

import java.util.Comparator;

/**
 * A queue that returns the highest priority (rather than the oldest) value in
 * the queue.
 *
 * @param <T>
 */
public class PriorityQueue<T> implements Queue<T> {
    /**
     * The heap used to implement the priority queue.
     */
    private Heap<T> heap;

    /**
     * Creates a new priority queue that uses the specified comparator to
     * determine the priority of the elements in the queue.
     *
     * @param comparator The comparator used to compare elements.
     */
    public PriorityQueue(Comparator<T> comparator) {
        heap = new ArrayHeap<>(comparator);
    }

    /**
     * Creates a new priority queue without a comparator. The elements must
     * implement {@link Comparable}.
     */
    public PriorityQueue() {
        this(null);
    }


    @Override
    public void enqueue(T value) {
        heap.add(value);
    }

    @Override
    public T peek() {
        // this is not the ideal implementation of this method, but it is
        // the best possible implementation given the limitations of our
        // Heap interface
        T value = heap.remove();
        heap.add(value);
        return value;
    }

    /**
     * Removes and returns the highest priority item in the queue.
     *
     * @return The highest priority item in the queue.
     */
    @Override
    public T dequeue() {
        return heap.remove();
    }

    @Override
    public int size() {
        return heap.size();
    }
}
