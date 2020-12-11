package session;

import util.MyList;
import java.util.Arrays;

/**
 * @author Prajwal Krishna
 * Beginning of class SafeArrayList
 * @param <T> class is of generic type
 */
public class SafeArrayList<T> implements MyList<T> {
    /**
     * The current size (number of elements) of the list.
     */
    private int size;

    /**
     * The array used to store elements in the list.
     */
    private Object[] elements;

    /**
     * Creates a new, empty list.
     */
    public SafeArrayList() {
        size = 0;
        elements = new Object[8];
    }

    /**
     * a synchronised add  method
     * the whole method that adds to the array list is synchronised because this the main data structure used by the threads
     * @param element The element to add to the list.
     */
    @Override
    public synchronized void add (T element){
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }

        elements[size] = element;
        size++;
    }

    /**
     * a synchronised get method
     * which will get the the value in the given index
     * this is synched because multiple threads may collide together
     * @param index The index of the desired element.
     *
     * @return the value in the given index
     */
    @SuppressWarnings("unchecked")
    @Override
    public synchronized T get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }

        return (T)elements[index];
    }

    /**
     * a synchronised size method
     * this method will give the size of the array list for a given thread
     * since several threads may have different size, to have consistency this method is synchronised
     * @return integer size
     */
    @Override
    public synchronized int size() {
        return size;
    }
}
