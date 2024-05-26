package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> a = new ArrayList<>();

        for (int i = 0; i < (1 << n); i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    list.add(nums[j]);
                }

            }
            a.add(list);



        }
        return a; }
}
