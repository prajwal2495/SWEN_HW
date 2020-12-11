package HomeWork;

/**
 * @author Prajwal Krishna
 * beginning of class Node
 */
public class Node {

    Object item;
    Node node;


    /**
     * method getItem()
     * returns the item object
     * @return an Object
     */
    public Object getItem(){
        return item;
    }

    /**
     * method setItem()
     * sets the given item to the object
     * @param item, which is of type Object
     */
    public void setItem(Object item){
        this.item = item;
    }

    /**
     * method getNode()
     * helps in getting the information on the current node
     * @return and object of type Node
     */
    public Node getNode(){
        return node;
    }

    /**
     * method setNode()
     * sets the object of type node to a particular object
     * @param node, an object of type Node
     */
    public void setNode(Node node){
        this.node = node;

    }
}
