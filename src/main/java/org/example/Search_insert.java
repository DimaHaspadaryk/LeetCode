package org.example;

public class Search_insert {
    public static int searchInsert(int[] nums, int target) {
        int mid = (nums.length / 2) - 1;
        if (target >= nums[mid]) {
            for (int i = mid; i < nums.length; i++) {
                if (target == nums[i]) {
                    mid = i;
                }
            }
        }


        if (target < nums[mid]) {
            for (int n = 0; n < mid; n++) {
                if (target == nums[n]) {
                    mid = n;
                }
            }
        }
        return mid;

    }
}
