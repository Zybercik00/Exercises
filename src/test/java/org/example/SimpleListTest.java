package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class SimpleListTest {



    @Test
    void testGetInTheMiddleMethod() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        Object result = simpleList.get(2);
        assertEquals("c", result);
    }

    @Test
    void testGetFirstElementMethod() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        Object result = simpleList.get(0);
        assertEquals("a", result);
    }
    @Test
    void testGetLastElementMethod() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        Object result = simpleList.get(simpleList.size - 1);
        assertEquals("f", result);
    }

    @Test
    void testGetAfterLastElementMethod() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        assertThrowsExactly(IndexOutOfBoundsException.class, () -> simpleList.get(simpleList.size));
    }

    @Test
    void testGetAfterAfterLastElementMethod() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        assertThrowsExactly(IndexOutOfBoundsException.class, () -> simpleList.get(simpleList.size * 2));
    }

    @Test
    void remoweInTheMiddleTest() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        simpleList.remove(2);
        assertEquals("d", simpleList.get(2));
        assertEquals(5, simpleList.size);
    }

    @Test
    void removeFirstTest() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        simpleList.remove(0);
        assertEquals("b", simpleList.get(0));
//        assertEquals(3, simpleList.size);
    }

    @Test
    void removeLastTest() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        simpleList.remove(5);
        assertEquals("e", simpleList.get(simpleList.size - 1));
        assertEquals(5, simpleList.size);
    }

    @Test
    void removeUnreachableTest() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        assertThrowsExactly(IndexOutOfBoundsException.class, () -> simpleList.remove(8));

    }

    @Test
    void addElementOnTheMiddle() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        simpleList.add(3, "z");
        assertEquals("z", simpleList.get(3));
        assertEquals("b", simpleList.get(1));
        assertEquals("c", simpleList.get(2));
        assertEquals("d", simpleList.get(4));
        assertEquals("e", simpleList.get(5));
        assertEquals(7, simpleList.size);
    }
    @Test
    void addElementOnTheBeginning() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        simpleList.add(0, "z");
        assertEquals("z", simpleList.get(0));
        assertEquals("c", simpleList.get(3));
        assertEquals(7, simpleList.size);
    }

    @Test
    void addElementOnTheEnd() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        simpleList.add(5, "z");
        assertEquals("z", simpleList.get(5));
        assertEquals("a", simpleList.get(0));
        assertEquals("b", simpleList.get(1));
        assertEquals("c", simpleList.get(2));
        assertEquals("d", simpleList.get(3));
        assertEquals("e", simpleList.get(4));
        assertEquals(7, simpleList.size);
    }

    @Test
    void testSetFirstElementMethod() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        Object result = simpleList.set(0, "z");
        assertEquals("z", simpleList.get(0));
    }

    @Test
    void testSetElementInTheMiddleMethod() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        Object result = simpleList.set(3, "z");
        assertEquals("z", simpleList.get(3));
    }

    @Test
    void testSetLastElementMethod() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(0, "a");
        simpleList.add(1, "b");
        simpleList.add(2, "c");
        simpleList.add(3, "d");
        simpleList.add(4, "e");
        simpleList.add(5, "f");
        Object result = simpleList.set(4, "z");
        assertEquals("z", simpleList.get(4));
    }
}