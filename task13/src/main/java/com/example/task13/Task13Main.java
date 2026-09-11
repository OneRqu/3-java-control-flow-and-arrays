package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        int[] filteredArr = removeMoreThen1000(arr); // метод был бесполезен, так как никуда не записывал новый массив
        System.out.println(java.util.Arrays.toString(filteredArr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) return arr;

        int count = 0;
        for (int number : arr) {
            if (number <= 1000) {
                count++;
            }
        }

        int[] newArray = new int[count];

        count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                newArray[count] = arr[i];
                count++;
            }
        }

        return newArray;
    }

}