package com.st.find;

public class MinJumpsToReachTheEnd {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        System.out.println(minJumps(arr)); // 2
    }

    public static int minJumps(int arr[]) {
        if (arr.length <= 1) return 0;
        int currentEnd = 0;
        int jump =0;
        int maxReach = 0;

        for(int i=0; i< arr.length; i++) {
            maxReach = Math.max(maxReach, i +  arr[i]);
            if(i == currentEnd) {
                jump++;
                currentEnd = maxReach;
            }
            if(currentEnd >= arr.length-1)   break;
        }
        return currentEnd >= arr.length-1 ? jump : -1;
    }
}
