package HomeWork;

import java.util.Comparator;

/**
 * Beginning of the class PriorityQueue implements Queue interface
 * @param <T>, PriorityQueue is a generic class
 */
public class PriorityQueue<T> implements Queue<T>{
    MyHeap<T> myHeap;
    private Comparator comparator;

    /**
     * Constructor of class PriorityQueue
     * initialises the comparator to null
     */
    public PriorityQueue(){
        myHeap = new MyHeap<T>();
        comparator = null;
    }

    /**
     * constructor of class PriorityQueue
     * @param comparator, comparator to compare between values
     */
    public PriorityQueue( Comparator comparator) {
        this.myHeap = new MyHeap<T>();
        this.comparator = comparator;
    }

    /**
     * method enQueue()
     * used to add the value into the queue in turn into the heap
     * @param value, value to added to the queue
     */
    @Override
    public void enQueue(T value) {
        myHeap.add(value);
        System.out.println("Using priority Queue : Item added to heap: " + value);
    }

    /**
     * method peek()
     * used to peek the root node of the heap
     * @return
     */
    @Override
    public T peek() {
        return (T)this.myHeap.array[0];
    }

    /**
     * method deQueue()
     * used to remove the root node from the heap.
     * @return root node which is removed from the heap.
     */
    @Override
    public T deQueue() {
        T removed = myHeap.remove();
        System.out.println("Using priority Queue : Root node removed from heap:"+removed);
        return removed;
    }

    /**
     * method size()
     * used to check the number of elements in the heap
     * @return
     */
    @Override
    public int size() {
        return this.myHeap.size();
    }

    public static void main(String[] args) {
        MyHeap<Integer> myHeap = new MyHeap<>();
        StringComparator stringComparator = new StringComparator();

        Queue<Integer> queue = new PriorityQueue();

        Queue<String> stringQueue = new PriorityQueue(stringComparator);

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(0);

        System.out.println("Size of the queue:"+queue.size());
        System.out.println("Peeking:"+queue.peek());

        queue.deQueue();
        System.out.println("Size of the queue after one dequeue:"+queue.size());


    }
}
