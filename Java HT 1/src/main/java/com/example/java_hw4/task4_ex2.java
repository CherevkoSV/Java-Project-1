package com.example.java_hw4;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.*;

public class task4_ex2 {
    public static void main(String[] args) {
        Integer[] numbers = {8, 1, 2, 5, 7, 12, 3};

        System.out.print("\nПочатковий масив: " + Arrays.toString(args) + " \n");

        Arrays.sort(args);
        System.out.println("\nСортований від найменшого до найбільшого: " + Arrays.toString(args));

        Arrays.sort(args, Collections.reverseOrder());
        System.out.println("\nCортований від найбільшого до найменшого: " + Arrays.toString(args));

        innerSort(numbers);
        System.out.println("\nCортований від країв найбільші, в середині найменші: " + Arrays.toString(numbers));
    }

    private static void innerSort(Integer[] numbers) {
        int[] sortedNumbers = new int[0];
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sortedNumbers = addElement(numbers[i], sortedNumbers);
            } else {
                sortedNumbers = addElement(sortedNumbers, numbers[i]);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sortedNumbers[i];
        }
    }

    public static int[] addElement(int[] arr, int element) {
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = element;
        return newArr;
    }

    public static int[] addElement(int element, int[] arr) {
        int newArr[] = new int[arr.length + 1];
        newArr[0] = element;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
}