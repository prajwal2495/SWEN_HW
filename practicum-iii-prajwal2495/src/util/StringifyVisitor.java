package util;

public class StringifyVisitor<T> implements Visitor<T> {
    private StringBuilder builder;

    public StringifyVisitor() {
        builder = new StringBuilder();
    }

    @Override
    public void visit(BinaryNode<T> node) {
        if(builder.length() != 0) {
            builder.append(" ");
        }
        builder.append(node.getValue());
    }

    @Override
    public String toString() {
        return builder.toString();
    }

    public void reset() {
        builder = new StringBuilder();
    }
}
