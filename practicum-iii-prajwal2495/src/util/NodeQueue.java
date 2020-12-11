package util;

/**
 * A node-based implementation of a queue.
 *
 * @param <T> The type of values stored in the queue.
 */
public class NodeQueue<T> implements Queue<T> {
    /**
     * The front of the queue. This contains the oldest value in the queue.
     */
    private Node<T> front;

    /**
     * The back of the queue. This contains the newest value in the queue.
     */
    private Node<T> back;

    /**
     * The number of values in the queue.
     */
    private int size;

    /**
     * Creates a new, empty queue.
     */
    public NodeQueue() {
        front = null;
        back = null;
        size = 0;
    }

    @Override
    public void enqueue(T value) {
        // create a new node
        Node<T> node = new Node<>(value);
        // if the front is currently null...
        if(front == null) {
            // ...set front and back to the new node
            front = node;
            back = node;
        } else {
            // ...otherwise, make the new node the new back of the queue
            back.setNext(node);
            back = node;
        }
        // increment size
        size++;
    }

    @Override
    public T peek() {
        // return the value at the front of the queue
        return front.getValue();
    }

    @Override
    public T dequeue() {
        // get the value from the front
        T value = front.getValue();
        // move the front to the next node in the queue
        front = front.getNext();
        // decrement the size
        size--;
        // return the value
        return value;
    }

    @Override
    public int size() {
        return size;
    }
}
