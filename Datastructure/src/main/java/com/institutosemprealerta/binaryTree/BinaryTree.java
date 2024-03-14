package com.institutosemprealerta.binaryTree;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        if (root == null) {
            this.root = newNode;
        } else {
            Node<T> current = this.root;

            while (true) {
                if (newNode.getValue().compareTo(current.getValue()) < 0) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(newNode);
                        break;
                    }
                } else {
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(newNode);
                        break;
                    }
                }
            }
        }
    }

    public void inOrder(Node<T> current) {
        if (current != null) {
            inOrder(current.getLeft());
            System.out.println(current.getValue());
            inOrder(current.getRight());
        }
    }

    public void preOrder(Node<T> current) {
        if (current != null) {
            System.out.println(current);
            preOrder(current.getLeft());
            preOrder(current.getRight());
        }
    }

    public void postOrder(Node<T> current) {
        if (current != null) {
            postOrder(current.getLeft());
            postOrder(current.getRight());
            System.out.println(current);
        }
    }

    public boolean remove(T value) {
        // search for an element in the tree
        Node<T> current = this.root;
        Node<T> currentFather = null;

        while (current != null) {
            if (current.getValue().equals(value)) {
                break;
            } else if (value.compareTo(current.getValue()) < 0) { // the value is smaller than the current
                currentFather = current;
                current = current.getLeft();
            } else {
                currentFather = current;
                current = current.getRight();
            }
        }

        if (current != null) {
            if (current.getRight() != null) {
                Node<T> replacer = current.getRight();
                Node<T> replacerFather = current;

                while (replacer.getLeft() != null) {
                    replacerFather = replacer;
                    replacer = replacer.getLeft();
                }
                replacer.setLeft(current.getLeft());
                if (currentFather != null) {
                    if (current.getValue().compareTo(currentFather.getValue()) < 0) currentFather.setLeft(replacer);
                    else {
                        currentFather.setRight(replacer);
                    }
                } else {
                    this.root = replacer;
                }

                if (replacer.getValue().compareTo(replacerFather.getValue()) < 0) replacerFather.setLeft(null);
                else {
                    replacerFather.setRight(null);
                }
            } else if (current.getLeft() != null) { // if it has soon at the left
                Node<T> replacer = current.getLeft();
                Node<T> replacerFather = current;

                while (replacer.getRight() != null) {
                    replacerFather = replacer;
                    replacer = replacer.getRight();
                }

                if (currentFather != null) {
                    if (current.getValue().compareTo(currentFather.getValue()) < 0) currentFather.setLeft(replacer);
                    else {
                        currentFather.setRight(replacer);
                    }
                } else {
                    this.root = replacer;
                }

                if (replacer.getValue().compareTo(replacerFather.getValue()) < 0) replacerFather.setLeft(null);
                else {
                    replacerFather.setRight(null);
                }

            } else { //  doesn't have son
                if (currentFather != null) {
                    if (current.getValue().compareTo(currentFather.getValue()) < 0) currentFather.setLeft(null);
                    else {
                        currentFather.setRight(null);
                    }
                } else {
                    this.root = null;
                }
            }
        }

        return current != null;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
