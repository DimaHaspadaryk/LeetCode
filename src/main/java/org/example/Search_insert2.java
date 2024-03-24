package org.example;

public class Search_insert2 {
    public static int searchInsert2(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        if (target < nums[0])
            return 0;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target)
                right = mid;
            else {
                left = mid;
            }
        }
        if (nums[left] == target) return left;
        else return right;

    }
}
