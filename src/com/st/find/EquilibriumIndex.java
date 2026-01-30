package com.st.find;

public class EquilibriumIndex {
//    Sum of elements on left of i == Sum of elements on right of i
    public static int findEquilibrium(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i; // first equilibrium index
            }
            leftSum += arr[i];
        }

        return -1; // no equilibrium index
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println("Equilibrium Index: " + findEquilibrium(arr));
    }
}
