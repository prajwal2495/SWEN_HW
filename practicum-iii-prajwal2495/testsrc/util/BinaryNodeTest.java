package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNodeTest {

    @Test
    void create() {
        int expected = 1234;
        BinaryNode<Integer> node = new BinaryNode<>(expected);

        assertEquals(expected, node.getValue());
        assertNull(node.getLeft());
        assertNull(node.getRight());
    }

    @Test
    void prefixTraversal() {
        BinaryNode<String> root = new BinaryNode<>("A");
        root.setLeft(new BinaryNode<>("B"));
        root.setRight(new BinaryNode<>("C"));
        String expected = "A B C";
        Visitor<String> visitor = new StringifyVisitor<>();

        root.prefixTraversal(visitor);

        assertEquals(expected, visitor.toString());
    }

    @Test
    void infixTraversal() {
        BinaryNode<String> root = new BinaryNode<>("A");
        root.setLeft(new BinaryNode<>("B"));
        root.setRight(new BinaryNode<>("C"));
        String expected = "B A C";
        Visitor<String> visitor = new StringifyVisitor<>();

        root.infixTraversal(visitor);

        assertEquals(expected, visitor.toString());
    }

    @Test
    void postfixTraversal() {
        BinaryNode<String> root = new BinaryNode<>("A");
        root.setLeft(new BinaryNode<>("B"));
        root.setRight(new BinaryNode<>("C"));
        String expected = "B C A";
        Visitor<String> visitor = new StringifyVisitor<>();

        root.postfixTraversal(visitor);

        assertEquals(expected, visitor.toString());
    }

    @Test
    void searchOneTrue() {
        int expected = 1234;
        BinaryNode<Integer> node = new BinaryNode<>(expected);

        assertTrue(node.search(expected));
    }

    @Test
    void searchOneFalse() {
        int expected = 1234;
        BinaryNode<Integer> node = new BinaryNode<>(expected);

        assertFalse(node.search(expected-1));
    }

    @Test
    void searchLeftTrue() {
        int expected = 1234;
        BinaryNode<Integer> node = new BinaryNode<>(1);
        node.setLeft(new BinaryNode<>(expected));

        assertTrue(node.search(expected));
    }

    @Test
    void searchRightTrue() {
        int expected = 1234;
        BinaryNode<Integer> node = new BinaryNode<>(1);
        node.setRight(new BinaryNode<>(expected));

        assertTrue(node.search(expected));
    }

    @Test
    void searchLeftRightLeftTrue() {
        int expected = 1234;
        BinaryNode<Integer> node = new BinaryNode<>(1);
        node.setLeft(new BinaryNode<>(expected));
        node.setRight(new BinaryNode<>(2));

        assertTrue(node.search(expected));
    }

    @Test
    void searchLeftRightRightTrue() {
        int expected = 1234;
        BinaryNode<Integer> node = new BinaryNode<>(1);
        node.setLeft(new BinaryNode<>(100));
        node.setRight(new BinaryNode<>(expected));

        assertTrue(node.search(expected));
    }

    @Test
    void searchLeftRightFalse() {
        int expected = 1234;
        BinaryNode<Integer> node = new BinaryNode<>(1);
        node.setLeft(new BinaryNode<>(100));
        node.setRight(new BinaryNode<>(200));

        assertFalse(node.search(expected));
    }

    @Test
    void binarySearchOneTrue() {
        int expected = 1234;
        BinaryNode<Integer> node = new BinaryNode<>(expected);

        assertTrue(node.binarySearch(expected));
    }

    @Test
    void binarySearchLeftTrue() {
        int expected = 100;
        BinaryNode<Integer> node = new BinaryNode<>(expected);
        node.binaryInsert(expected-1);

        assertTrue(node.binarySearch(expected-1));
    }

    @Test
    void binarySearchLeftFalse() {
        int expected = 100;
        BinaryNode<Integer> node = new BinaryNode<>(expected);
        node.binaryInsert(expected-1);

        assertFalse(node.binarySearch(expected-2));
    }

    @Test
    void binarySearchRightTrue() {
        int expected = 100;
        BinaryNode<Integer> node = new BinaryNode<>(expected);
        node.binaryInsert(expected+1);

        assertTrue(node.binarySearch(expected+1));
    }

    @Test
    void binarySearchRightFalse() {
        int expected = 100;
        BinaryNode<Integer> node = new BinaryNode<>(expected);
        node.binaryInsert(expected+1);

        assertFalse(node.binarySearch(expected+2));
    }

    @Test
    void binarySearchLeftRightLeft() {
        int expected = 100;
        BinaryNode<Integer> node = new BinaryNode<>(expected);
        node.binaryInsert(expected-1);
        node.binaryInsert(expected+1);

        assertTrue(node.binarySearch(expected-1));
    }

    @Test
    void binarySearchLeftRightRight() {
        int expected = 100;
        BinaryNode<Integer> node = new BinaryNode<>(expected);
        node.binaryInsert(expected-1);
        node.binaryInsert(expected+1);

        assertTrue(node.binarySearch(expected+1));
    }

    @Test
    void binarySearchLeftRightFalse() {
        int expected = 100;
        BinaryNode<Integer> node = new BinaryNode<>(expected);
        node.binaryInsert(expected-1);
        node.binaryInsert(expected+1);

        assertFalse(node.binarySearch(expected+2));
    }


}