package com.institutosemprealerta.binaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.add(10);
        tree.add(8);
        tree.add(5);
        tree.add(9);
        tree.add(7);
        tree.add(18);
        tree.add(13);
        tree.add(20);

        System.out.println("In order");
        tree.inOrder(tree.getRoot());

        System.out.println("---------------");

        System.out.println("Pre order");
        tree.preOrder(tree.getRoot());

        System.out.println("---------------");

        System.out.println("Post order");
        tree.postOrder(tree.getRoot());

        System.out.println("----------------");


        System.out.println("removed");

        tree.remove(20);
        tree.inOrder(tree.getRoot());

        System.out.println("----------------");


        System.out.println("removed");

        tree.remove(5);
        tree.inOrder(tree.getRoot());


        System.out.println("----------------");


        System.out.println("removed");

        tree.remove(8);
        tree.inOrder(tree.getRoot());


        System.out.println("----------------");

        System.out.println("removed");

        tree.remove(9);
        tree.inOrder(tree.getRoot());

        System.out.println("----------------");


        System.out.println("removed");

        tree.remove(10);
        tree.inOrder(tree.getRoot());
    }
}
