package org.example;

import java.util.Arrays;

public class SingleNum {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int imposter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int first = nums[i];
            int second = nums[i + 1];
            if (first == second) {
                continue;
            } else {
                if (first > second) {
                    imposter = second;
                }
                if (first < second) {
                    imposter = first;
                }
            }


        }
        return imposter;
    }
}
