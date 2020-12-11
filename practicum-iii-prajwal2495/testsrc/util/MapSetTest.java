package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapSetTest {
    @Test
    public void create() {
        Set<String> set = new MapSet<>();

        assertEquals(0, set.size());
    }

    @Test
    public void addOne() {
        Set<String> set = new MapSet<>();
        set.add("abc");

        assertEquals(1, set.size());
        assertTrue(set.contains("abc"));
    }

    @Test
    public void addTwo() {
        Set<String> set = new MapSet<>();
        set.add("abc");
        set.add("def");

        assertEquals(2, set.size());
        assertTrue(set.contains("abc"));
        assertTrue(set.contains("def"));
    }

    @Test
    public void addTwoRemoveOne() {
        Set<String> set = new MapSet<>();
        set.add("abc");
        set.add("def");
        set.remove("abc");

        assertEquals(1, set.size());
        assertFalse(set.contains("abc"));
        assertTrue(set.contains("def"));
    }

    @Test
    public void addOneRemoveOne() {
        Set<String> set = new MapSet<>();
        set.add("abc");
        set.remove("abc");

        assertEquals(0, set.size());
        assertFalse(set.contains("abc"));
    }

}