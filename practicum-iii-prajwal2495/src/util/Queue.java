package util;

/**
 * The interface defining the Queue Abstract Data Type (ADT). A queue is a
 * First-In, First-Out data structure. The oldest value still in the queue is
 * the first to be returned.
 *
 * @param <T> The type of value contained in the queue.
 */
public interface Queue<T> {
    /**
     * Adds a new value to the back of the queue.
     *
     * @param value The value added to the back of the queue.
     */
    void enqueue(T value);

    /**
     * Returns but does not remove the value at the front of the queue.
     *
     * @return The value at the front of the queue.
     */
    T peek();

    /**
     * Removes and returns the value at the front of the queue.
     *
     * @return The value at the front of the queue.
     */
    T dequeue();

    /**
     * Returns the number of values in the queue.
     *
     * @return The number of values in the queue.
     */
    int size();
}
