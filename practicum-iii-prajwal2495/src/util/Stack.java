package util;

/**
 * The interface defining the Stack Abstract Data Type (ADT). A stack is a
 * First-In, Last-Out (FILO) data structure. The most recently added value is
 * the first to be returned.
 *
 * @param <T> The type of value contained in the stack.
 */
public interface Stack<T> {
    /**
     * Adds a new value to the top of the stack.
     *
     * @param value The value added to the top of the stack.
     */
    void push(T value);

    /**
     * Returns but does not remove the value at the top of the stack.
     *
     * @return The value at the top of the stack.
     */
    T peek();

    /**
     * Removes and returns the value at the top of the stack.
     *
     * @return The value at the top of the stack.
     */
    T pop();

    /**
     * Returns the number of values on the stack.
     *
     * @return The number of values currently on the stack.
     */
    int size();
}
