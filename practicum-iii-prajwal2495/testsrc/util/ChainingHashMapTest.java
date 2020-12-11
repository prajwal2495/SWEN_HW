package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainingHashMapTest {
    @Test
    void create() {
        Map<String,Integer> map = new ChainingHashMap<>();

        assertEquals(0, map.size());
    }

    @Test
    void getEmpty() {
        Map<String,Integer> map = new ChainingHashMap<>();

        assertNull(map.get("abc"));
    }

    @Test
    void putOne() {
        Map<String,Integer> map = new ChainingHashMap<>();
        int expected = 123;

        map.put("abc", expected);

        int actual = map.get("abc");

        assertEquals(1, map.size());
        assertEquals(expected, actual);
    }

    @Test
    void putTwo() {
        Map<String,Integer> map = new ChainingHashMap<>();

        map.put("abc", 123);
        map.put("def", 234);


        assertEquals(2, map.size());
        assertEquals(123, map.get("abc"));
        assertEquals(234, map.get("def"));
    }

    @Test
    void putMany() {
        Map<String,Integer> map = new ChainingHashMap<>();

        for(int i=100; i<200; i++) {
            map.put(Integer.toString(i), i);
        }

        assertEquals(100, map.size());

        for(int i=100; i<200; i++) {
            assertEquals(i, map.get(Integer.toString(i)));
        }

        assertNull(map.get("99"));
    }

    @Test
    void putAndRemoveOne() {
        Map<String,Integer> map = new ChainingHashMap<>();
        int expected = 123;

        map.put("abc", expected);
        int actual = map.remove("abc");

        assertEquals(0, map.size());
        assertEquals(expected, actual);
        assertNull(map.get("abc"));
    }

    @Test
    void removeMany() {
        Map<String,Integer> map = new ChainingHashMap<>();

        for(int i=100; i<200; i++) {
            map.put(Integer.toString(i), i);
        }

        assertEquals(100, map.size());

        for(int i=100; i<200; i++) {
            assertEquals(i, map.remove(Integer.toString(i)));
        }

        assertEquals(0, map.size());
    }

}