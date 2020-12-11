package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeStackTest {
    @Test
    void create() {
        Stack<String> stack = new NodeStack<>();

        assertEquals(0, stack.size());
    }

    @Test
    void pushOne() {
        Stack<String> stack = new NodeStack<>();

        stack.push("123");

        assertEquals(1, stack.size());
    }

    @Test
    void pushOnePeek() {
        Stack<String> stack = new NodeStack<>();
        String expected = "567";
        stack.push(expected);

        String actual1 = stack.peek();
        String actual2 = stack.peek();

        assertEquals(1, stack.size());
        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
    }

    @Test
    void pushOnePop() {
        Stack<String> stack = new NodeStack<>();
        String expected = "234";
        stack.push(expected);

        String actual = stack.pop();

        assertEquals(0, stack.size());
        assertEquals(expected, actual);
    }

    @Test
    void pushTwoPeekPop() {
        Stack<String> stack = new NodeStack<>();
        String[] expected = { "123", "234" };
        stack.push(expected[0]);
        stack.push(expected[1]);

        String actualPeek1 = stack.peek();
        String actualPop1 = stack.pop();
        String actualPeek2 = stack.peek();
        String actualPop2 = stack.pop();

        assertEquals(0, stack.size());
        assertEquals(expected[1], actualPeek1);
        assertEquals(expected[1], actualPop1);
        assertEquals(expected[0], actualPeek2);
        assertEquals(expected[0], actualPop2);
    }
}