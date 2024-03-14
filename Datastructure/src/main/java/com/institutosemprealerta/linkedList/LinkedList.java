package com.institutosemprealerta.linkedList;

public class LinkedList<T> {
    private Node<T> last;
    private Node<T> first;
    private int size;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        if (first == null && last == null) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
        this.size++;
    }

    public Node<T> get(int position) {
        Node<T> current = this.first;
        for (int i = 0; i < position; i++) {
            if (current.getNext() != null) {
                current = current.getNext();
            }
        }
        return current;
    }

    public void remove(T value) {
        Node<T> past = null;
        Node<T> current = this.first;

        for (int i = 0; i < this.getSize(); i++) {
            Node<T> next = current.getNext();
            if (current.getValue().equals(value)) {
                if (this.size < 2) {
                    this.first = null;
                    this.last = null;
                } else if (current == this.first) {
                    first = next;
                    current.setNext(null);
                } else if (current == last) {
                    this.last = past;
                    past.setNext(null);
                } else {
                    past.setNext(next);
                    current = null;
                    break;
                }
            }
            past = current;
            current = next;
        }
        size--;
    }

    public IteratorLinkedList<T> getIterator() {
        return new IteratorLinkedList<T>(this.first);
    }

    public LinkedList() {
        this.size = 0;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "last=" + last +
                ", first=" + first +
                ", size=" + size +
                '}';
    }
}
