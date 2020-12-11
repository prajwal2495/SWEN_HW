package HomeWork;

import session.Heap;

import java.util.Arrays;

/**
 * An array-based implementation of a heap data structure.
 */
public class ArrayHeap implements Heap {

    private int[] array;
    private int size;

    /**
     * Constructor for class ArrayHeap
     * initialises array and size field.
     */
    public ArrayHeap() {
        this.array = new int[8];
        this.size = 0;
    }

    /**
     * method add()
     * @param value, takes an integer value and adds it to the correct position in heap by sifting up
     * manages the size of the array.
     */
    @Override
    public void add(int value) {
        if(array.length == this.size){
            this.array = Arrays.copyOf(this.array,size * 2);
        }

        this.array[size] = value;
        siftUp(this.array,size);
        size++;
    }

    /**
     * method remove()
     * removes the root node from the heap.
     * sift downs the elements in the heap to maintain the priority in the heap
     * @return the root value that was removed from the heap.
     */
    @Override
    public int remove() {
        int root = this.array[0];
        this.size--;
        this.array[0] = this.array[size];
        array[size] = 0;

        siftDown(this.array,size);

        return root;
    }

    /**
     * method size()
     * @return the number of elements in the heap
     */
    @Override
    public int size(){
        return this.size;
    }

    @Override
    public String toString() {
        return "ArrayHeap{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    /**
     * Sifts a value up from the specified index in a heap.
     *
     * @param array The heap.
     * @param index The index to begin sifting up.
     */
    static void siftUp(int[] array, int index) {
        int parent = (index - 1) / 2;
        while(array[parent] > array[index]) {
            swap(array, index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    /**
     * Sifts a value down from the root in a heap.
     *
     * @param array The heap.
     * @param size The size of the heap.
     */
    static void siftDown(int[] array, int size) {
        int to = 0;
        int from;
        do {
            from = to;

            int left = 2 * from + 1;
            int right = left + 1;
            if(left < size && array[left] < array[to]) {
                to = left;
            }

            if(right < size && array[right] < array[to]) {
                to = right;
            }

            swap(array, from, to);

        } while(from != to);
    }

    /**
     * Swaps the values at the specified indexes.
     * @param array The array in which the values should be swapped.
     * @param from The value which needs to be swapped with the index 'To'.
     * @param to The value which needs to be swapped with the index 'From'.
     */
    static void swap(int[] array, int from, int to) {
        if(from != to) {
            int tmp = array[from];
            array[from] = array[to];
            array[to] = tmp;
        }
    }


    public static void main(String[] args) {
        ArrayHeap heap =  new ArrayHeap();

        heap.add(10);
        heap.add(20);
        heap.add(4);
        heap.add(100);
        heap.add(1);

        System.out.println(heap.toString());

        heap.remove();

        System.out.println(heap.toString());

    }
}
