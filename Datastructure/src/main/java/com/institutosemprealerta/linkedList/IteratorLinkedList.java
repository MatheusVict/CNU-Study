package com.institutosemprealerta.linkedList;

public class IteratorLinkedList<T> {
    private Node<T> node;

    public boolean hasNext() {
        return node.getNext() != null;
    }

    public Node<T> getNext() {
        this.node = this.node.getNext();
        return this.node.getNext();
    }

    public IteratorLinkedList(Node<T> current) {
        this.node = current;
    }
}
