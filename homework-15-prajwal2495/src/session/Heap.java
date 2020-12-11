package session;

/**
 * beginning of the interface heap
 * provides the signature of the common methods that is required for the functionality of the heap.
 * @param <T>, heap is a generic interface
 */
public interface Heap {

    public void add(int value);

    public int remove();

    public int size();

}