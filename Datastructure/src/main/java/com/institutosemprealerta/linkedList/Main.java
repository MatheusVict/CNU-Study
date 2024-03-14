package com.institutosemprealerta.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();

        for (int i = 0; i < 1000; i++) {
            linked.add("oi" + i);
        }

        System.out.println(linked);
        System.out.println(linked.get(1));
        System.out.println(linked.get(2));
        System.out.println(linked.get(3));
        System.out.println(linked.get(0));
        System.out.println("---------------------\n");
        System.out.println("Iterator");

        long initialTime = System.currentTimeMillis();
        IteratorLinkedList<String> iterator = linked.getIterator();
        while (iterator.hasNext()) {
            iterator.getNext();
        }
        long finalTime = System.currentTimeMillis();

        System.out.println("time to read the linked");
        System.out.println(finalTime - initialTime);

        System.out.println("\n");
        System.out.println("-----------------------------------");
        System.out.println("after removing");
        linked.remove("oi4");
        linked.remove("oi3");
        linked.remove("oi2");
        linked.remove("oi1");
        System.out.println(linked + "\n");
    }
}