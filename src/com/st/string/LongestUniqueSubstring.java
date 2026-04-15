package com.st.string;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";

        int left = 0;
        int maxLength = 0;





        Set<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {

            // If duplicate found, remove from left
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            // Add current char
            set.add(str.charAt(right));

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Max length: " + maxLength);
    }
}
