package com.st.arrays.function;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysFunction {
    public static void main(String[] args) {
//        Arrays.toString()
//        Convert array to readable string
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

//        Arrays.sort()
        int[] arr1 = {5, 2, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        With Range
        Arrays.sort(arr, 1, 3); // sort from index 1 to 2
        System.out.println(Arrays.toString(arr));

//        Object Array with Comparator
        String[] arr2 = {"cat", "apple", "dog"};
        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr2));

//        Arrays.binarySearch()
        int index = Arrays.binarySearch(arr1, 9);
        System.out.println(index);
//        Returns -(insertionPoint) - 1 if not found

//        Arrays.equals()
        Arrays.equals(arr1, arr);

//        Arrays.deepEquals()
//        Compare nested arrays
//        Arrays.deepEquals(arr1, arr);

//        Arrays.copyOf()
        int[] copy = Arrays.copyOf(arr, arr.length);
//        Resize while copying
        int[] bigger = Arrays.copyOf(arr, 10);

        int[] part = Arrays.copyOfRange(arr, 1, 4);

//        Fill array with value
        Arrays.fill(arr, 0);

        Arrays.fill(arr, 1, 3, -1);

//        Arrays.stream()
        IntStream stream = Arrays.stream(new int[]{1, 2, 3});
        Stream<String> s = Arrays.stream(new String[]{"A", "B"});

        int[][] matrix = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrix));

        Arrays.parallelSort(arr);
        Arrays.setAll(arr, i -> i * 2);
        Arrays.parallelSetAll(arr, i -> i * i);
    }
}
