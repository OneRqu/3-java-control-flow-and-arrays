package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int min;
        int minIndex;

        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            arr[minIndex] = arr[i];
            arr[i] = min;

        }

    }
    // 9 11 7 8
    // i = 0
    // min = 9, minIndex = 0
    // j = 1
    // min = 7, minIndex = 2
    // arr[2] = arr[0] = 9
    // arr[0] = 7
    // 7 11 9 8


    // i = 1
    // min = 11, minIndex = 1
    // j = 2
    // min = 8, minIndex = 3
    // arr[3] = arr[1] = 11
    // arr[1] = 8
    // 7 8 9 11


    // i = 2
    // min = 9, minIndex = 2
    // j = 3
    // min = 9, minIndex = 2
    // arr[2] = arr[2] == 9
    // arr[2] = 9
    // 7 8 9 11

    // i = 3 = arr.length - 1
}