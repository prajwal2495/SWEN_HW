package util;

import java.util.Comparator;

/**
 * A node in a binary tree; also the root of its own sub-tree.
 *
 * @param <T>
 */
public class BinaryNode<T> {
    /**
     * The value stored in this node.
     */
    private T value;

    /**
     * Used to compare values.
     */
    private Comparator<T> comparator;

    /**
     * The left subtree; may be null.
     */
    private BinaryNode<T> left;

    /**
     * The right subtree; may be null.
     */
    private BinaryNode<T> right;

    /**
     * Creates a new binary node with the specified value.
     *
     * @param value The value in this node.
     */
    public BinaryNode(T value) {
        this(value, null);
    }

    /**
     * Creates a new binary node with the specified value.
     *
     * @param value The value in this node.
     * @param comparator The comparator used for binary insert and search. May
     *                   be null.
     */
    public BinaryNode(T value, Comparator<T> comparator) {
        this.value = value;
        this.comparator = comparator;
    }

    /**
     * Returns the value in this node.
     *
     * @return The value in this node.
     */
    public T getValue() {
        return value;
    }

    /**
     * Sets the value in this node.
     *
     * @param value The new value for this node.
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Returns the left subtree; may be null if the left subtree is empty.
     *
     * @return The left subtree.
     */
    public BinaryNode<T> getLeft() {
        return left;
    }

    /**
     * Sets the left subtree.
     *
     * @param left The new left subtree.
     */
    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    /**
     * Returns the right subtree; may be null if the right subtree is empty.
     *
     * @return The right subtree.
     */
    public BinaryNode<T> getRight() {
        return right;
    }

    /**
     * Sets the right subtree.
     *
     * @param right The new right subtree.
     */
    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }

    /**
     * Inserts the value into a binary search tree.
     *
     * @param value The value to insert.
     */
    public void binaryInsert(T value) {
        if(compare(value) > 0) {
            if(left != null) {
                left.binaryInsert(value);
            } else {
                left = new BinaryNode<>(value, comparator);
            }
        } else {
            if(right != null) {
                right.binaryInsert(value);
            } else {
                right = new BinaryNode<>(value, comparator);
            }
        }
    }

    /**
     * Performs a linear search over the entire tree for the target value.
     * Returns true if the target is found, and false otherwise.
     *
     * @param target The target value.
     *
     * @return True if the target is found, and false otherwise.
     */
    public boolean search(T target) {
        if(target.equals(value)) {
            return true;
        } else if(left != null && left.search(target)) {
            return true;
        } else if(right != null && right.search(target)) {
            return true;
        }
        return false;
    }

    /**
     * Performs a search on a binary search tree. This will only work if all
     * values have been inserted using the {@link #binaryInsert(Object)}
     * method.
     *
     * @param target The value to search for.
     *
     * @return True if the target value is found, false otherwise.
     */
    public boolean binarySearch(T target) {
        int comparison = compare(target);
        if(comparison == 0) {
            return true;
        } else if(comparison > 0) {
            return left != null && left.binarySearch(target);
        } else {
            return right != null && right.binarySearch(target);
        }
    }

    /**
     * Visits the nodes in the binary tree in prefix order (middle, left
     * right).
     *
     * @param visitor The visitor that is traversing the tree.
     */
    public void prefixTraversal(Visitor<T> visitor) {
        visitor.visit(this);
        if(left != null) {
            left.prefixTraversal(visitor);
        }
        if(right != null) {
            right.prefixTraversal(visitor);
        }
    }

    /**
     * Visits the nodes in the binary tree in infix order (left, middle,
     * right).
     *
     * @param visitor The visitor that is traversing the tree.
     */
    public void infixTraversal(Visitor<T> visitor) {
        if(left != null) {
            left.infixTraversal(visitor);
        }
        visitor.visit(this);
        if(right != null) {
            right.infixTraversal(visitor);
        }
    }

    /**
     * Visits the nodes in the binary tree in postfix order (left, right,
     * middle).
     *
     * @param visitor The visitor that is traversing the tree.
     */
    public void postfixTraversal(Visitor<T> visitor) {
        if(left != null) {
            left.postfixTraversal(visitor);
        }
        if(right != null) {
            right.postfixTraversal(visitor);
        }
        visitor.visit(this);
    }

    /**
     * Compares the other value to this node's value. If the comparator is not
     * null, it is used. Otherwise, the value is cast into a comparable; this
     * may cause an exception.
     *
     * @param other The other value to which this node's value is being
     *              compared.
     *
     * @return An integer that is less than 0 if this value comes before, 0
     * if the two values are equivalent, and greater than one if this value
     * comes after.
     */
    private int compare(T other) {
        if(comparator != null) {
            return comparator.compare(this.value, other);
        } else {
            Comparable<T> comparable = (Comparable<T>)value;
            return comparable.compareTo(other);
        }
    }
}
