package org.example;



public class MissingNumber {
    public int missingNumber(int[] nums) {
        int rez = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (i + 1);
            rez += nums[i];
        }
        return sum - rez;
    }
}
