package com.institutosemprealerta.ordenation;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.println("Desordered");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
            System.out.println("Number: " + array[i]);
        }


        int size = array.length;

        for (int i = size / 2 - 1; i >= 0; i--) {
            heap(array, size, i);
        }


        System.out.println("Almost ordered");
        for (int j : array) {
            System.out.println("Number: " + j);
        }

        for (int i = size - 1; i > 0; i--) {
            int auxiliary = array[0];

            array[0] = array[i];
            array[i] = auxiliary;
            heap(array, i, 0);
        }


        System.out.println("Oredered");
        for (int j : array) {
            System.out.println("Number: " + j);
        }
    }

    private static void heap(int[] array, int size, int position) {
        int root = position;
        int left = 2 * position + 1;
        int right = 2 * position + 2;

        if (left < size && array[left] > array[root]) {
            //change with root
            root = left;
        }
        if (right < size && array[right] > array[root]) {
            root = right;
        }
        if (root != position) {
            int auxiliary = array[position];
            array[position] = array[root];
            array[root] = auxiliary;

            heap(array, size, root);
        }
    }
}
