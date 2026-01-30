package com.st.find;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadingElements {
    public static void main(String[] args) {
//        An element is called a leading element if it is greater than all the elements to its right.
//        i/p: Array = [16, 17, 4, 3, 5, 2]  O/P: Leaders = [17, 5, 2]
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);

    }

    public static void findLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();

        int maxFrommRight = arr[n-1];
        leaders.add(maxFrommRight);

        for(int i = n-2; i>=0; i--) {
            if(arr[i] >maxFrommRight) {
                maxFrommRight = arr[i];
                leaders.add(maxFrommRight);
            }
        }
        // Leaders are collected from right to left, reverse for correct order
        Collections.reverse(leaders);

        System.out.println("Leading Elements: " + leaders);
    }
}
