package com.institutosemprealerta.ordenation;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.println("Desordered");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
            System.out.println("Number: " + array[i]);
        }

        quicksort(array, 0, array.length - 1);

        System.out.println("Ordered");
        for (int item: array) {
            System.out.println(item);
        }
    }

    private static void quicksort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = slice(array, left, right);

            quicksort(array, left, pivot);
            quicksort(array, pivot + 1, right);
        }
    }

    private static int slice(int[] array, int left, int right) {
        int middle = (left + right) / 2;
        int pivot = array[middle];
        int i = left - 1;
        int j = right + 1;

        while (true) {

            do {
                i++;
            } while (array[i] < pivot);

            do {
                j--;
            } while (array[j] > pivot);

            if (i >= j) {
                return j;
            }
            int auxiliary = array[i];
            array[i] = array[j];
            array[j] = auxiliary;

        }
    }
}
