package org.example;

import java.util.Arrays;
import java.util.Queue;

public class SimpleList {
    Object[] elements;
    int size;

    public SimpleList() {
        this.elements = new Object[16];
        this.size = 0;
    }

    public Object get(int index) {
        if(checkIndexRange(index)) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        return elements[index];
    }
     public Object set(int setIndex, Object newElement) {
         if(setIndex < 0 || setIndex >= size) {
             throw new IndexOutOfBoundsException("index: " + setIndex);
         }
         Object oldElement = elements[setIndex];
         elements[setIndex] = newElement;
         return oldElement;
     }


    public void remove(int removeIndex) {
        if(removeIndex < 0 || removeIndex > size) {
            throw new IndexOutOfBoundsException("Exception");
        }
        if (removeIndex < size) {
            for (int index = removeIndex; index < size - 1; index++) {
                elements[index] = elements[index + 1];
            }
        }
        size = size - 1;
    }

    public void add(int addIndex, Object newElement) {

        for (int index = size; index > addIndex; index--) {
            elements[index] = elements[index-1];
        }
        elements[addIndex] = newElement;
        size = size + 1;
    }

    public boolean checkIndexRange(int index) {
        if (index < 0 || index >= size) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "SimpleList{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
