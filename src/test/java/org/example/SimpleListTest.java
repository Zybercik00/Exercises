package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class SimpleListTest {



    @Test
    void testGetInTheMiddleMethod() {
        SimpleList simpleList = new SimpleList(new Object[]{"a", "b", "c", "d", "e", null}, 5);
        Object result = simpleList.get(2);
        assertEquals("c", result);
    }

    @Test
    void testGetFirstElementMethod() {
        SimpleList simpleList = new SimpleList(new Object[]{"a", "b", "c", "d", "e", null}, 5);
        Object result = simpleList.get(0);
        assertEquals("a", result);
    }
    @Test
    void testGetLastElementMethod() {
        SimpleList simpleList = new SimpleList(new Object[]{"a", "b", "c", "d", "e", null}, 5);
        Object result = simpleList.get(simpleList.size - 1);
        assertEquals("e", result);
    }

    @Test
    void testGetAfterLastElementMethod() {
        SimpleList simpleList = new SimpleList(new Object[]{"a", "b", "c", "d", "e", null}, 5);
        assertThrowsExactly(IndexOutOfBoundsException.class, () -> simpleList.get(simpleList.size));
    }

    @Test
    void testGetAfterAfterLastElementMethod() {
        SimpleList simpleList = new SimpleList(new Object[]{"a", "b", "c", "d", "e", null}, 5);
        assertThrowsExactly(IndexOutOfBoundsException.class, () -> simpleList.get(simpleList.size * 2));
    }

    @Test
    void remoweInTheMiddleTest() {
        SimpleList simpleList = new SimpleList(new Object[]{"a", "b", "c", "d", "e", null}, 5);
        simpleList.remove(2);
        assertEquals("d", simpleList.get(2));
        assertEquals(4, simpleList.size);
    }

    @Test
    void removeFirstTest() {
        SimpleList simpleList = new SimpleList(new Object[]{"a", "b", "c", "d", "e", null}, 5);
        simpleList.remove(0);
        assertEquals("b", simpleList.get(0));
        assertEquals(4, simpleList.size);
    }

    @Test
    void removeLastTest() {
        SimpleList simpleList = new SimpleList(new Object[]{"a", "b", "c", "d", "e", null}, 5);
        simpleList.remove(5);
        assertEquals("d", simpleList.get(simpleList.size - 1));
        assertEquals(4, simpleList.size);
    }

    @Test
    void removeUnreachableTest() {
        SimpleList simpleList = new SimpleList(new Object[]{"a", "b", "c", "d", "e", null}, 5);
        assertThrowsExactly(IndexOutOfBoundsException.class, () -> simpleList.remove(6));

    }

    @Test
    void addElement() {
        SimpleList simpleList = new SimpleList(new Object[]{"a", "b", "c", "d", "e", null}, 10);
        simpleList.add(2, "z");
        assertEquals("z", simpleList.get(2));
        assertEquals("c", simpleList.get(3));
        assertEquals("d", simpleList.get(4));
        assertEquals("e", simpleList.get(5));
        assertEquals(6, simpleList.size);
    }
    @Test
    void addElementOnTheBeginning() {
        SimpleList simpleList = new SimpleList(new Object[]{"a", "b", "c", "d", "e"}, 5);
        simpleList.add(0, "z");
        assertEquals("z", simpleList.get(0));
        assertEquals("c", simpleList.get(3));
        assertEquals(6, simpleList.size);
    }


}