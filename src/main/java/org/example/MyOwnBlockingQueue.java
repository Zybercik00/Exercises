package org.example;

public class MyOwnBlockingQueue {

    Object[] elements;
    int size;
    int addIndex = 1;

    public MyOwnBlockingQueue(Object[] elements, int size) {
        this.elements = elements;
        this.size = size;
    }

    public void put(Object newElement) {
        for (int index = size; index > 1; index--) {
            elements[index] = elements[index-1];
        }
        elements[addIndex] = newElement;
    }

    public Object take() {
        return null;
    }


    public void waitMethod() {
    }

    public void notifyMethod() {
    }

}
