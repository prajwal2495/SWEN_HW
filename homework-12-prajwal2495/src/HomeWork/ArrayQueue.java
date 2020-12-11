package HomeWork;

import java.util.Arrays;

/**
 * @author  Prajwal Krishna
 * beginning of class ArrayQueue which implements the interface Queue
 * @param <A>, is a representation that this class is a generic class
 */
public class ArrayQueue<A> implements Queue{
    private Object[] array;
    private Object front;
    private Object back;
    private int size;
    private int length;


    /**
     * Constructor method
     * assigns the initial queue's front and back to null and size to 0
     */
    public ArrayQueue(int length) {
        array = new Object[length];
        front = null;
        back = null;
        size = 0;
        this.length = length;
    }

    /**
     * Method enqueue()
     * Helps in adding a value of generic type to the back of the queue
     * @param value, A value which is an array of Object type, that gets added to the back of the queue in a loop
     */
    @Override
    public void enQueue(Object[] value) {
        // 2,3,4,5,6
        for (int i = 0; i < value.length; i++) {
            if (this.size == 0) {
                front = value[0];
                back = value[0];
                this.array[0] = value[0];
                size++;
            } else {
                if(size == this.array.length) {  //if array becomes full after adding latest element.
                    this.array = Arrays.copyOf(this.array, (this.array.length * 2));
                    this.length = this.length * 2;
                    this.array[i] = value[i];
                    back = this.array[i];
                    size++;
                }
                else {
                    this.array[i] = value[i];
                    back = this.array[i];
                    size++;
                }
            }
        }
    }

    /**
     * method peek()
     * This method helps to extract the first value of the queue
     * @return and Object which is the element at the front of the queue
     */
    @Override
    public Object peek() {
        return this.front;
    }

    /**
     * method getLength()
     * @return an integer which is the length of the array
     */
    public int getLength() {
        return length;
    }

    /**
     * method deQueue()
     * This method helps in the movement of the queue
     * in a Queue the first person on front gets to to the activity first
     * This method also removes the first element from the queue
     * @return an Object, which is the element at the front of the queue
     */
    public Object dequeue(){
        Object val = this.front;
        for(int i = 0; i < array.length - 1; i++){
            this.array[i] = this.array[i+1];     //move every element up by 1 index.
        }
        this.front = this.array[0]; //element at index 0 will be front.
        size--;
        if(this.front == null){
            this.back = null;
        }
        else if(this.size == 1){
            this.front = array[0];
            this.back = array[0];
        }
        else {
            return val;
        }
        return val;
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> aq = new ArrayQueue(2);
        Object[] arr = new Object[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 2;
        }

        aq.enQueue(arr);
        System.out.println("Queue:");
        System.out.println(Arrays.toString(aq.array));
        System.out.println("Front : "+aq.front);
        System.out.println("Peek : "+aq.peek());
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        System.out.println("Peek : "+aq.peek());
        aq.dequeue();
        System.out.println("Peek : "+aq.peek());
        System.out.println("Front : "+aq.front);
        System.out.println("Back : "+aq.back);
    }


    @Override
    public Object deQueue() {
        return null;
    }

    @Override
    public void enQueue(Object value) {

    }

    @Override
    public int size() {
        return this.size;
    }

}
