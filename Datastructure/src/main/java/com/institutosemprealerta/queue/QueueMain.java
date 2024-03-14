package com.institutosemprealerta.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        queue.add("Matheus");
        queue.add("Natalia");
        queue.add("Shirley");

        System.out.println(queue.get());

        queue.remove();
        System.out.println(queue.get());
    }
}
