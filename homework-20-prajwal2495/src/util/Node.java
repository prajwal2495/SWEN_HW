package util;

/**
 * Used to implement node-based data structures.
 *
 * @param <T> The type of value stored by the node.
 */
class Node<T> {
    /**
     * The node's value.
     */
    private T value;

    /**
     * The next node in the sequence.
     */
    private Node<T> next;

    /**
     * Creates a new node with the specified value.
     *
     * @param value The value stored by the node.
     */
    Node(T value) {
        this(value, null);
    }

    /**
     * Creates a new node with the specified value and next node.
     *
     * @param value The value stored by this node.
     * @param next The next node in the sequence.
     */
    Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    /**
     * Returns the value stored by the node.
     *
     * @return The value stored by the node.
     */
    public T getValue() {
        return value;
    }

    /**
     * Returns the next node in the sequence; may be null.
     *
     * @return The next node in the sequence.
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Sets the next node in the sequence to the specified value.
     *
     * @param node The next node in the sequence.
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
