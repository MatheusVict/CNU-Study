package com.institutosemprealerta.stack;

import com.institutosemprealerta.linkedList.LinkedList;

public class Stack<T> {
    private LinkedList<T> linkedList;

    public Stack() {
        this.linkedList = new LinkedList<T>();
    }

    public void add(T value) {
        this.linkedList.add(value);
    }

    public void remove() {
        T elementToRemove = this.get();
        this.linkedList.remove(elementToRemove);
    }

    public T get() {
        return this.linkedList.getLast().getValue();
    }
}
