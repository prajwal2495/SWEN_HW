package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Provides a small set of common tests for list implementations.
 */
abstract class MyListTest {
    /**
     * Factory method implemented by subclasses to return a list
     * implementation to test.
     *
     * @param <T> The type of list to create.
     *
     * @return The new list.
     */
    abstract <T> MyList<T> makeList();

    /**
     * Tests creating an empty list.
     */
    @Test
    void create() {
       MyList<String> list = makeList();

       assertEquals(0, list.size());
       try {
           list.get(0);
           fail("should have thrown an exception");
       } catch(IndexOutOfBoundsException ioe) {
           assertEquals("Index out of range: 0", ioe.getMessage());
       }
    }

    /**
     * Tests a list to which a single element has been added.
     */
    @Test
    void addOne() {
        String expected = "abc";
        MyList<String> list = makeList();
        list.add(expected);

        assertEquals(1, list.size());
        assertEquals(expected, list.get(0));
    }

    /**
     * Tests a list to which many values have been added.
     */
    @Test
    void addMany() {
        String[] values = {
                "abc", "def", "ghi", "jkl", "mno", "pqr", "stu",
                "vwx", "yzz"
        };

        MyList<String> list = makeList();

        for(String value : values) {
            list.add(value);
        }

        assertEquals(values.length, list.size());
        for(int i=0; i<values.length; i++) {
            assertEquals(values[i], list.get(i));
        }
    }
}
