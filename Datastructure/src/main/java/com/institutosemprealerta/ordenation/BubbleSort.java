package com.institutosemprealerta.ordenation;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int past = 0;
                if (array[i] > array[j]) {
                    past = array[j];

                    array[j] = array[i];
                    array[i] = array[past];
                }
            }
        }

        for (int item: array) {
            System.out.println(item);
        }

    }
}
