package HomeWork;

/**
 * @author Prajwal Krishna
 * beginning of class StrigifyVisitor, child class of Visitor
 */
public class StringifyVisitor implements Visitor {
    private final StringBuilder builder;

    /**
     * constructor StringifyVisitor
     * used to initialise the stringBuilder
     */
    public StringifyVisitor() {
        this.builder = new StringBuilder();
    }


    /**
     * method visit()
     * used to record each visit to a node and append the value of that node to the stringBuilder
     * @param node, a specific node in a BinaryNode tree
     */
    @Override
    public void visit(BinaryNode node) {
        builder.append(node.getValue());
        builder.append(" ");
    }


    /**
     * method toString()
     * used to print put the traversing of the nodes.
     * @return
     */
    @Override
    public String toString() {
        return builder.toString();
    }
}
