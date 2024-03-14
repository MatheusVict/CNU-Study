package com.institutosemprealerta.ordenation;

public class Recursion {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
            System.out.println("Number is: " + array[i]);
        }

        int sum = sum(0, 0, array);
        System.out.println("Sum is: " + sum);

    }

    private static int sum(int sum, int position, int[] array) {

        if (position == array.length) {
            return sum;
        }
        sum += array[position];
        return sum(sum, position + 1, array);
    }
}
