package org.example;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Kth_Largest {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums[k - 1];
    }




}


