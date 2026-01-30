package com.st.manipulation;

import java.util.Arrays;

public class PrefixMinMac {
    public static void main(String[] args) {
//        For an array arr:
//        Prefix Max[i] = maximum from index 0 to i
//        Prefix Min[i] = minimum from index 0 to i

//        input: arr = [5, 3, 8, 6, 2]
//        Prefix Min : [5, 3, 3, 3, 2]
//        Prefix Max: [5, 5, 8, 8, 8]
        int[] arr = {5, 3, 8, 6, 2};
        prefixMin(arr);

        int[] arr1 = {5, 3, 8, 6, 2}; // 5 5 8 8 8
        prefixMax(arr1);

    }

    public static void prefixMin(int arr[]) {
        int prefixMin = arr[0];
        int k = 1;
        arr[0] = prefixMin;
        for(int i=1; i<arr.length; i++) {
//            if(prefixMin > arr[i]) {
//                prefixMin = arr[i];
//            }

            // alternate for above condition
            prefixMin = Math.min(prefixMin, arr[i]);

            arr[i] = prefixMin;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void prefixMax(int[] arr) {
        int prefixMax = arr[0];
        int k = 1;
        arr[0] = prefixMax;
        for(int i=1; i<arr.length; i++) {
//            if(prefixMax < arr[i]) {
//                prefixMax = arr[i];
//            }

            // alternate for above condition
            prefixMax = Math.max(prefixMax, arr[i]);

            arr[i] = prefixMax;
        }
        System.out.println(Arrays.toString(arr));
    }
}
