package util;

/**
 * A node used to represent node-based data structures like linked lists.
 *
 * @param <T> The type of value held by the data structure.
 */
public class Node<T> {
    /**
     * The value contained in this node.
     */
    private T value;

    /**
     * The next node in the sequence.
     */
    private Node<T> next;

    /**
     * Creates a new node.
     *
     * @param value The value contained in the new node.
     * @param next The next node in the sequence.
     */
    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    /**
     * Creates a new node with no next node.
     *
     * @param value The value contained in the new node.
     */
    public Node(T value) {
        this(value, null);
    }

    /**
     * Returns the value contained in the node.
     *
     * @return The value contained in the node.
     */
    public T getValue() {
        return value;
    }

    /**
     * Changes the value contained in the node.
     *
     * @param value The new value contained in the node.
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Returns the next node in the sequence. May be null if this is the
     * last node in the sequence.
     *
     * @return The next node in the sequence.
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Sets the next node in the sequence.
     *
     * @param next The next node in the sequence.
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * Returns a string representation of the node that is useful for
     * debugging.
     *
     * @return A string representation of the node.
     */
    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
