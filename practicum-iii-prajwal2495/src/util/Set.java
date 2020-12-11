package util;

/**
 * The basic interface for a set.
 *
 * @param <T>
 */
public interface Set<T> {
    /**
     * Adds a value to the set. If the value is already in the set, it is
     * ignored.
     *
     * @param value The value to add to the set.
     */
    void add(T value);

    /**
     * Removes the specified value from the set.
     *
     * @param value The value to remove from the set.
     */
    void remove(T value);

    /**
     * Returns true if the value is in the set, and false otherwise.
     *
     * @return True if the value is in the set, and false otherwise.
     */
    boolean contains(T value);

    /**
     * Returns the number of elements in the set.
     *
     * @return The number of elements in the set.
     */
    int size();
}
