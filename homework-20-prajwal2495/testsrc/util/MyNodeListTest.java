package util;

/**
 * Tests the node-based list implementation.
 */
class MyNodeListTest extends MyListTest {
    @Override
    <T> MyList<T> makeList() {
        return new MyNodeList<>();
    }
}
