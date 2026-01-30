package com.st.manipulation;

import java.util.Arrays;

public class RotateArrayByKPositions {
    public static void main(String[] args) {
        System.out.println("Hi");
//        Array = [10, 20, 30, 40, 50] K = 7  O/P: [40, 50, 10, 20, 30] Because K = 7 % 5 = 2

//        int[] arr = {10, 20, 30, 40, 50};
//        int k = 7;

//        int[] arr = {1, 2, 3, 4, 5, 6, 7}; int k = 3; Last 3 elements move to the front.  O/p: [5, 6, 7, 1, 2, 3, 4]
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rightRotate(arr, k);
        System.out.println(Arrays.toString(arr));

//        Left Rotation
//        Array = [1, 2, 3, 4, 5]  K = 2  [3, 4, 5, 1, 2]
        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 2;
        leftRotate(arr1, 2);
        System.out.println(Arrays.toString(arr1));
    }

    public static void rightRotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    public static void leftRotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        int left = start;
        int right = end;

        while(left<right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
