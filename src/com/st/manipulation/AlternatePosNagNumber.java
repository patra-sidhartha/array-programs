package com.st.manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternatePosNagNumber {
    public static void main(String[] args) {
//        [1, 2, 3, -4, -1, 4]
//        O/P: [1, -4, 2, -1, 3, 4]
        int[] arr = {1, 2, 3, -4, -1, 4};
        reArrangeArrayInPlace(arr);
    }

    public static void reArrange(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0)
                pos.add(num);
            else
                neg.add(num);
        }

        int i = 0, p = 0, n = 0;
        boolean turnPos = true;

        while (p < pos.size() && n < neg.size()) {
            arr[i++] = turnPos ? pos.get(p++) : neg.get(n++);
            turnPos = !turnPos;
        }

        while (p < pos.size()) arr[i++] = pos.get(p++);
        while (n < neg.size()) arr[i++] = neg.get(n++);

        System.out.println(Arrays.toString(arr));
    }

    public static void reArrangeArrayInPlace(int[] arr) {
        int pos = 0; // even index (should have +ve)
        int neg = 1; // odd index (should have -ve)
        int n = arr.length;

        while (pos < n && neg < n) {

            while (pos < n && arr[pos] >= 0) {
                pos += 2;
            }

            while (neg < n && arr[neg] < 0) {
                neg += 2;
            }

            if (pos < n && neg < n) {
//                swap(arr[pos], arr[neg]);
                int temp = arr[pos];
                arr[pos] = arr[neg];
                arr[neg] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
