package com.st.manipulation;

import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args) {
//        Input:  [4, 3, 7, 8, 6, 2, 1]
//        Output: [3, 7, 4, 8, 2, 6, 1]
//        Pattern Check: 3 < 7 > 4 < 8 > 2 < 6 > 1

        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        zigZag1(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void zigZag(int[] arr) {
        boolean flag = true; // true indicates "<" expected
        for(int i=0; i< arr.length-1; i++) {
            if(flag) {
                // "<" relation expected
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else {
                // ">" relation expected
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            flag = !flag; // flip for next index
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void zigZag1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            if (i % 2 == 0) {
                // even index: arr[i] < arr[i+1]
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else {
                // odd index: arr[i] > arr[i+1]
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }
}
