package HomeWork;

import java.util.Comparator;
import java.lang.Comparable;

/**
 * @author Prajwal Krishna
 * Beginning of class Binary Node
 */
public class BinaryNode<T> {
    private T value;
    private BinaryNode<T> leftNode;
    private BinaryNode<T> rightNode;
    private Comparator<T> comparator;

    /**
     * constructor BinaryNode()
     * initialises the generic T value and generic Comparators
     * @param value, generic Type Value
     * @param comparator, generic type Comparator
     */
    public BinaryNode(T value, Comparator<T> comparator) {
        this.value = value;
        this.comparator = comparator;
    }

    /**
     * constructor BinaryNode()
     * initialises the generic T value and generic Comparators
     * @param value, generic Type Value
     */
    public BinaryNode(T value) {
        this.value = value;
        this.comparator = null;
    }

    /**
     * method compare()
     * helps to compare 2 generic type nodes in a tree
     * if the comparator object is null, comparable is used to compare the object's specific fields
     * @param binaryNode1, tree node of generic type
     * @param binaryNode2, tree node of generic type
     * @return an integer value, which provides the information about the comparison between two objects
     */
    private int compare(T binaryNode1, T binaryNode2){
        if(this.comparator != null){
            return comparator.compare(binaryNode1, binaryNode2);
        }else{
            Comparable<T> comparableBinaryNode1 = (Comparable<T>) binaryNode1;
            Comparable<T> comparableBinaryNode2 = (Comparable<T>) binaryNode2;
            return comparableBinaryNode1.compareTo((T) comparableBinaryNode2);
        }
    }


    /**
     * method binarySearch()
     * this methods helps to find a specific node in the tree
     * @param target, the node in the tree of generic type that needs to be searched
     * @return a boolean value based on the result of search
     */
    public boolean binarySearch(T target) {
        if (compare(target, this.value) == 0) {
            return true;
        } else if (compare(target, this.value) < 0) {
            if(leftNode != null){
                return leftNode.binarySearch(target);
            }else{
                return false;
            }
        }else if(compare(target,this.value) > 0){
            if(rightNode != null){
                return rightNode.binarySearch(target);
            }else{
                return false;
            }
        }
        return false;
    }

    /**
     * method binaryInsert()
     * this method helps to add a new node to the binary tree
     * node with value lesser than root node value goes to left sub tree else right sub tree
     * @param newValue, a new node of tree of generic type
     */
    public void binaryInsert(T newValue) {
        if (compare(newValue, value) < 0) {
            if (leftNode != null) {
                leftNode.binaryInsert(newValue);
            } else {
                leftNode = new BinaryNode(newValue,this.comparator);
            }
        } else if (compare(newValue,value)>0) {
            if (rightNode != null) {
                rightNode.binaryInsert(newValue);
            }else{
                rightNode = new BinaryNode(newValue, this.comparator);
            }
        }
    }

    /**
     * Method InfixTraversal()
     * helps to traverse through the nodes in the tree
     * leftNode --> rootNode --> rightNode
     * @param visitor, a Visitor object used to visit each node in the tree
     */
    public void infixTraversal(Visitor visitor){
        if(leftNode != null){
            leftNode.infixTraversal(visitor);
        }
        visitor.visit(this);
        if(rightNode != null){
            rightNode.infixTraversal(visitor);
        }
    }

    /**
     * method getValue()
     * used to get the value associated with each node in the tree
     * @return an integer value associated with the node
     */
    public T getValue() {
        return value;
    }
}
