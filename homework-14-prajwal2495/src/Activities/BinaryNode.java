package Activities;

/**
 * @author Prajwal Krishna
 * Beginning of class Binary Node
 */
public class BinaryNode {
    private int value;
    private BinaryNode leftNode;
    private BinaryNode rightNode;

    /**
     * Constructor BinaryNode
     * Takes and integer and assigns it to the class field value
     * @param value, an integer value
     */
    public BinaryNode(int value) {
        this.value = value;
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
     * Method prefixVisitor()
     * helps to traverse through the nodes in the tree
     * rootNode --> leftNode --> rightNode
     * @param visitor, a Visitor object used to visit each node in the tree
     */
    public void prefixVisitor(Visitor visitor){
        visitor.visit(this);

        if(leftNode != null){
            leftNode.prefixVisitor(visitor);
        }

        if(rightNode != null){
            rightNode.prefixVisitor(visitor);
        }
    }

    /**
     * Method postFixVisitor()
     * helps to traverse through the nodes in the tree
     * leftNode --> rightNode --> rootNode
     * @param visitor, a Visitor object used to visit each node in the tree
     */
    public void postFixVisitor(Visitor visitor){


        if(leftNode != null){
            leftNode.postFixVisitor(visitor);
        }

        if(rightNode != null){
            rightNode.postFixVisitor(visitor);
        }

        visitor.visit(this);
    }


    /**
     * method getValue()
     * used to get the value associated with each node in the tree
     * @return an integer value associated with the node
     */
    public int getValue() {
        return value;
    }

    /**
     * method setLeftNode()
     * used to set leftNode for a parent node
     * @param leftNode, a BinaryNode object
     */
    public void setLeftNode(BinaryNode leftNode) {
        this.leftNode = leftNode;
    }


    /**
     * method setRightNode()
     * used to set rightNode for a parent node
     * @param rightNode, a BinaryNode object
     */
    public void setRightNode(BinaryNode rightNode) {
        this.rightNode = rightNode;
    }
}
