package util;

/**
 * A node-based implementation of the list abstract data type.
 *
 * @param <T> The type of element stored in the list.
 */
public class MyNodeList<T> implements MyList<T> {
    /**
     * The size (number of elements) in the list.
     */
    private int size;

    /**
     * The head (first) node in the list.
     */
    private Node<T> head;

    /**
     * The tail (last) node in the list.
     */
    private Node<T> tail;

    /**
     * Creates a new, empty list.
     */
    public MyNodeList() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public void add(T element) {
        Node<T> node = new Node<>(element);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }

        Node<T> target = head;
        for(int count=0; count<index; count++) {
            target = target.getNext();
        }

        return target.getValue();
    }

    @Override
    public int size() {
        return size;
    }
}
