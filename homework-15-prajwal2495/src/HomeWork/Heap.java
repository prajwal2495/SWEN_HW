package HomeWork;

/**
 * beginning of the interface heap
 * provides the signature of the common methods that is required for the functionality of the heap.
 * @param <T>, heap is a generic interface
 */
public interface Heap <T> {

    public T add(T value);

    public T remove();

    public int size();

}
