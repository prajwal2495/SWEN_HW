package util;

/**
 * Interface for the list abstract data type.
 *
 * @param <T> The type of element stored by this list.
 */
public interface MyList<T> {
    /**
     * Adds an element to the list.
     *
     * @param element The element to add to the list.
     */
    void add(T element);

    /**
     * Gets the element at a specific index in the list.
     *
     * @param index The index of the desired element.
     *
     * @return The element stored at the specified index in the list.
     */
    T get(int index);

    /**
     * Returns the size (number of elements) of the list.
     *
     * @return The size of the list.
     */
    int size();
}
