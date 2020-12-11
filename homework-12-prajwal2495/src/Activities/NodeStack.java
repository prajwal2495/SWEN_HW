package Activities;

/**
 * @author  Prajwal Krishna
 * beginning of class NodeQueue which implements the interface Queue
 * @param <S>, is a representation that this class is a generic class
 */
public class NodeStack<S> implements Stack<S> {

    private Node<S> top;
    private int size;

    /**
     * Constructor method
     * assigns the initial queue's front and back to null and size to 0
     */
    public NodeStack(){
        this.top = null;
        size = 0;
    }

    /**
     * Method push()
     * Helps in adding a value of generic type to the top of the Stack
     * @param value, A value of generic type S that gets added to the top of the Stack
     */
    @Override
    public void push(S value) {
        Node<S> node = new Node<>(value);
        node.setNext(this.top);
        this.top = node;
        this.size++;
    }

    /**
     * method pop()
     * in a Stack the first value on the top the stack gets removed
     * This method also removes the top element from the stack
     * @return the popped value, which would be the first element of the stack
     */
    @Override
    public S pop() {
        S value = this.top.getValue();
        this.top = top.getNext();
        return value;
    }

    /**
     * method peek()
     * This method helps to extract the top value of the Stack
     * @return the top element of the Stack
     */
    @Override
    public S peek() {
        return this.top.getValue();
    }

    /**
     * method size()
     * returns the actual size of the Stack
     * @return an integer which depicts the size of the Stack
     */
    @Override
    public int size() {
        return size;
    }
}
