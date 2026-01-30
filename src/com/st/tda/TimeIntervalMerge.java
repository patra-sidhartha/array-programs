package com.st.tda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeIntervalMerge {
    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] merged = mergeIntervals(intervals);

        System.out.print("Merged Intervals: ");
        for (int[] interval : merged) {
            System.out.print(Arrays.toString(interval) + " ");
        }
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        for(int[] interval: intervals) {
            if(result.isEmpty()) {
                result.add(interval);
            } else {
                int last[] = result.get(result.size()-1);
                if(interval[0] <= last[1]) {
                    last[1] = Math.max(last[1], interval[1]);
                } else {
                    result.add(interval);
                }
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
