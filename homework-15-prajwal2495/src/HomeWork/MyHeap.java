package HomeWork;

import java.util.Comparator;
import java.lang.Comparable;
import java.util.Arrays;

/**
 * Beginning of the class MyHeap
 * @param <T> MyHeap is a generic class
 */
public class MyHeap<T> implements Heap<T> {

    private Comparator<T> comparator;
    private Comparable<T> comparable;
    protected Object[] array;
    private int size;

    /**
     * constrictor for the class MyHeap
     * initialises comparable, array and size fields.
     */
    public MyHeap() {
        this.comparator = null;
        this.array = new Object[8];
        this.size = 0;
    }

    public MyHeap(Comparator<T> comparator) {
        this.comparator = comparator;
        this.array = new Object[8];
        this.size = 0;
    }

    /**
     * method add()
     * adds the generic type value to the heap based on the priority of that value
     * the right place in the heap is decided by calling the sift up method
     * @param value, value to be added to the heap
     * @return the value added to the heap
     */
    @Override
    public T add(T value) {
        if(array.length == size){
            array = Arrays.copyOf(array, size * 2);
        }
        array[size] = value;
        size ++;
        siftUp(array, size - 1);
        return value;
    }

    /**
     * method remove()
     * removes the root node from the heap and rectifies the priority of the all the elements in the heap by calling the sift down method
     * @return the root node.
     */
    @Override
    public T remove() {
        T value = (T)array[0];
        size --;
        array[0] = array[size];
        array[size] = null;
        siftDown(array, size);

        return value;
    }

    /**
     * method size()
     * returns the number of elements in the heap
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * method swap()
     * whenever a value is added or removed from the heap.
     * to maintain the priority of the values siftdown and siftup methods call swap method to swap the elements from one node to another in the heap.
     * @param array
     * @param from
     * @param to
     */
    static void swap(Object[] array, int from, int to){
        if(from != to){
            Object temp = array[from];
            array[from] = array[to];
            array[to] = temp;
        }
    }

    /**
     * method siftup()
     * whenever a value is added to the heap
     * siftup is used to maintain the priority in the heap
     * @param array, heap array
     * @param index, size of the array
     */
    void siftUp(Object[] array, int index){
        int parentNodeIndex = (index - 1) / 2;
        while(compare((T) array[parentNodeIndex],(T) array[index]) < 0){
            swap(array, index, parentNodeIndex);
            index = parentNodeIndex;
            parentNodeIndex = (index - 1) / 2;
        }
    }

    /**
     * method siftDown()
     * whenever a node from the heap is removed.
     * the heap is sifted down to maintain the priority in the heap
     * @param array, the heap
     * @param index, usually the size of the heap
     */
    void siftDown(Object[] array, int index){
        int to = 0;
        int from;

        do{
            from = to;
            int left = 2 * from + 1;
            int right = left + 1;
            if((left < size && compare((T) array[left], (T)array[to]) > 0)){
                to = left;
            }

            if((right < size && compare((T) array[right], (T)array[to]) > 0)){
                to = right;
            }

            swap(array, from , to );

        }while (from != to);
    }

    /**
     * method compare()
     * uses comparator and comparable fields to match between 2 values in the heap
     * @param parentArray, parent node in the heap
     * @param array, all other nodes in the heap
     * @return integer depicted the result of the comparison
     */
    private int compare(T parentArray, T array){
        if(this.comparator != null){
            return comparator.compare(parentArray,array);
        }else{
            Comparable<T> comparableParent = (Comparable<T>)parentArray;
            Comparable<T> comparableArray = (Comparable<T>) array;
            return comparableArray.compareTo((T)comparableParent);
        }
    }

    @Override
    public String toString() {
        return "MyHeap{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {
        StringComparator stringComparator = new StringComparator();

        Heap<Integer> heap = new MyHeap(stringComparator);

        heap.add(10);
        heap.add(20);
        heap.add(2);

        System.out.println(heap.toString());

        System.out.println("Current size of heap is:"+heap.size());

        heap.remove();

        System.out.println(heap.toString());

        System.out.println("Current size of the heap is:"+heap.size());

        System.out.println(heap.toString());
    }
}
