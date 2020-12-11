package Activities;

/**
 * @author Prajwal Krishna
 * beginning of class Node with a Generic type S
 */

public class Node<S> {
    private S value;
    private Node<S> next;

    /**
     * Constructor method
     * @param value of type S
     * initialises the value of the node and next node to null
     */
    public Node(S value) {
        this.value = value;
        this.next = null;
    }

    /**
     * Method getNext()
     * helps in identifying the next node from the current node
     * @return an object of Node with generic type
     */
    public Node<S> getNext() {
        return next;
    }

    /**
     * Method getValue()
     * Helps is extracting the value stored in the current node.
     * @return a value of type S
     */
    public S getValue(){
        return this.value;
    }

    /**
     * method setNext()
     * helps in creating a link of nodes by setting the given node as the next node of the current node
     * @param next, and object of Node which is of type S
     */
    public void setNext(Node<S> next) {
        this.next = next;
    }

    /**
     * method setValue()
     * helps in initialising an object of node with a value
     * the type of value and type of node should match in this case, otherwise it will result in a compiler error
     * @param node
     */
    public void setValue(S node) {
        this.value = node;
    }
}
