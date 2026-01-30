package com.st.find;

public class EqualSplit {

    public static boolean canSplit(int[] arr) {
        int totalSum = 0;

        // Step 1: Calculate total sum
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        // Step 2: Try splitting at each index
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                return true; // valid split found
            }
        }
        return false; // no valid split
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        System.out.println(canSplit(arr)); // false
        int[] arr1 = {1, 2, 3, 6};
        System.out.println(canSplit(arr1)); // true
    }
}
