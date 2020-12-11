package util;

/**
 * Tests the array-based list implementation.
 */
class MyArrayListTest extends MyListTest {
    @Override
    <T> MyList<T> makeList() {
        return new MyArrayList<>();
    }
}
