package HomeWork;
import Activities.*;

/**
 * @author  Prajwal Krishna
 * beginning of class NodeQueue which implements the interface Queue
 * @param <S>, is a representation that this class is a generic class
 */
public class NodeQueue<S> implements Queue<S> {
    private Node<S> front;
    private Node<S> back;
    private int size;


    /**
     * Constructor method
     * assigns the initial queue's front and back to null and size to 0
     */
    public NodeQueue() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    /**
     * Method enqueue()
     * Helps in adding a value of generic type to the back of the queue
     * @param value, A value of generic type S that gets added tot he back of the queue
     */
    @Override
    public void enQueue(S value) {
        Node<S> node = new Node<>(value);
        if(front == null){
            front = node;
            back = node;
        }
        else{
            back.setNext(node);
            back = node;
        }
        size++;
    }

    /**
     * method peek()
     * This method helps to extract the first value of the queue
     * @return an Object or value of generic type S
     */
    @Override
    public S peek() {
        return this.front.getValue();
    }


    /**
     * method deQueue()
     * This method helps in the movement of the queue
     * in a Queue the first person on front gets to to the activity first
     * This method also removes the first element from the queue
     * @return an Object or value of generic type S
     */
    @Override
    public S deQueue() {
        S value = this.front.getValue();
        this.front = front.getNext();

        if(front == null){
            back = null;
        }
        size--;
        return value;
    }


    /**
     * method size()
     * returns the actual size of the array
     * @return an integer which depicts the size of the Queue
     */
    @Override
    public int size() {
        return this.size;
    }



    @Override
    public void enQueue(Object[] value) {
    }


    @Override
    public Object dequeue() {
        return null;
    }
}

