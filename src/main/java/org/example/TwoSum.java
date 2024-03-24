package org.example;

import java.util.Arrays;

public class TwoSum {
    public static String twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int res[] = {nums[i], nums[j]};
                    return Arrays.toString(res);

                }

            }
        }
        return null;
    }

}
