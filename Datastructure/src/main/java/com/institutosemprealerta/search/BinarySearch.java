package com.institutosemprealerta.search;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[10000000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }


        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        int position = binarySearch(array, choice);

        System.out.println("element is " + array[position] + " in the position " + position);


    }

    private static int binarySearch(int[] array, int choice) {
        int steps = 0;

        int start = 0;
        int end = array.length -1;
        int middle;
        while (start <= end) {
            steps++;

            middle = (start + end) /2;

            if (array[middle] == choice) {
                System.out.println("steps" + steps);
                return middle;
            } else if (array[middle] < choice) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }

}
