package com.institutosemprealerta.ordenation;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }

        int smallestPosition, aux;

        for (int i = 0; i < array.length; i++) {
            smallestPosition =i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestPosition]) smallestPosition = j;
            }

            aux = array[smallestPosition];
            array[smallestPosition] = array[i];
            array[i] = aux;
        }

        System.out.println("sorted\n");
        for (int item: array) {
            System.out.println(item + "\n");
        }
    }
}
