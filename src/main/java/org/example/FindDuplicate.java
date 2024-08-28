package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {

        //O(n^2)
        int duplicate = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicate = nums[j];

                }
            }
        }
        return duplicate;
    }

    //O(n)
    public int findDuplicate2(int[] nums) {
        int duplicate = 0;
        HashSet set = new HashSet();

        for (int i = 0; i < nums.length - 1; i++) {
          set.add(nums[i]);
          if (set.contains(nums[i + 1])){
           duplicate = nums[i + 1];
            }
        }

        return duplicate;
    }
}
