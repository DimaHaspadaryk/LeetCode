package org.example;

public class Contains_duplicate {
    public static boolean containsDuplicate(int[] nums) {
        boolean res = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[0] == nums[i + 1]) {
                res = true;
                break;
            } else
                res = false;

        }

        return res;
    }
}
