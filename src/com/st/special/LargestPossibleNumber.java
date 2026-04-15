package com.st.special;

import java.util.Arrays;

public class LargestPossibleNumber {
    public static void main(String[] args) {
        String[] arr = {"3", "30", "34", "5", "9"};

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        System.out.println(Arrays.toString(arr));

        // Edge case: all zeros
        if (arr[0].equals("0")) {
            System.out.println("0");
            return;
        }

        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        System.out.println(result.toString());

    }
}
