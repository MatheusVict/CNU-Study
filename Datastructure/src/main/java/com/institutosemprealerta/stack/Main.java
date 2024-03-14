package com.institutosemprealerta.stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.add("Matheus");
        stack.add("Natalia");
        stack.add("Shirley");

        System.out.println(stack.get());

        stack.remove();
        System.out.println(stack.get());
    }
}
