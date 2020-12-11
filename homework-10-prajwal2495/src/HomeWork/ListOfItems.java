package HomeWork;

import java.util.Arrays;

/**
 * @author Prajwal Krishna
 * beginning of class ListOfItems which extends the abstract class AbstractItems
 */
public class ListOfItems extends AbstractItems{

    Node head;
    Node tail;
    int size;

    /**
     * Constructor method
     * initialises the head and tail objects of type Node to point to the newNode
     */
    public ListOfItems(){
        Node newNode = new Node();
        this.head = newNode;
        this.tail = newNode;
    }

    /**
     * Method getHead()
     * returns the object head
     * @return an object of type Node
     */
    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    /**
     * method setTail()
     * sets the tail method to a new Node as and when the noce is updated
     * @param tail, an object of type Node
     */
    public void setTail(Node tail) {
        this.tail = tail;
    }

    /**
     * Method size()
     * gets teh size of the object
     * @return  Integer, the size of the object
     */
    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    /**
     * method setNext()
     * helps set the tail object to the new node when the new Node is created
     * @param new_node, takes an object of type Node as a parameter
     */
    public void setNext(Node new_node){
        this.tail.setNode(new_node);
    }


    /**
     * method add()
     * adds a particular object passed as parameter to the array of objects
     * @param obj, a parameter of type Object which will be added to the array of object created
     */
    @Override
    public void add(Object obj){
        if(this.size == 0){
            this.head.setItem(obj);
        }else{
            Node new_node = new Node();
            new_node.setItem(obj);
            setNext(new_node);
            setTail(new_node);
        }
        size++;
    }


    /**
     * method get()
     * helps in extracting the information from the object array from a particular index
     * @param index, index of which the information is required
     * @return an Object at a particular index provided
     */
    @Override
    public Object get(int index){
        int count = 0;
        Node node = this.getHead();
        for(count = 0; count != index; count++){
            node = getNext(node);
        }
        return node.getItem();
    }


    /**
     * Method getNext()
     * gets the next object in sequence of the given object
     * @param node, an object of type Node
     * @return an Object of type Node
     */
    public Node getNext(Node node){
        return node.getNode();

    }
}
