package com.institutosemprealerta.queue;

import com.institutosemprealerta.linkedList.LinkedList;

public class Queue<T> {
    private LinkedList<T> linkedList;

    public Queue() {
        this.linkedList = new LinkedList<T>();
    }

    public void add(T value) {
        this.linkedList.add(value);
    }

    public void remove() {
        T value = this.get();
        this.linkedList.remove(value);
    }

    public T get() {
        return  this.linkedList.getFirst().getValue();
    }


}
