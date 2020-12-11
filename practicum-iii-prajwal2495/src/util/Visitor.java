package util;

public interface Visitor<T> {
    void visit(BinaryNode<T> node);
}
