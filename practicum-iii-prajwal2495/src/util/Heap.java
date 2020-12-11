package util;

/**
 * Interface for a generic heap.
 *
 * @param <T>
 */
public interface Heap<T> {
    /**
     * Adds a value to the heap.
     *
     * @param value The new value to add.
     */
    void add(T value);

    /**
     * Removes and returns the highest priority value in the heap.
     *
     * @return The highest priority value in the heap.
     */
    T remove();

    /**
     * Returns the number of values currently in the heap.
     *
     * @return The number of values currently in the heap.
     */
    int size();
}
