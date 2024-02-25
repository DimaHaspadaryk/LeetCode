package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class solution {
    public static int calc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input price : ");
        int a = sc.nextInt();
        int x = (a * 15) / 100;
        return x;
    }

    public static int sqrt(int x) {
        double sqrtroot = 0;
        if (x > 0) {
            double temp;
            sqrtroot = x / 2;
            do {
                temp = sqrtroot;
                sqrtroot = (temp + (x / temp)) / 2;
            }
            while ((temp - sqrtroot) != 0);
//            return (int) sqrtroot;
        } else {
            System.out.println(0);
        }

        return (int) sqrtroot;
    }

    public static int climbStairs(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int romanToInteger(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int previosnum = 0;
        int result = 0;
        for (String i : s.split("")) {
            int current = map.get(i);
            if (current > previosnum) {
                result = result + current - previosnum - previosnum;
            } else {
                result = result + current;
            }
            previosnum = current;
        }
        return result;

    }

    public static int lengthOfLastWord1(String s) {
        int length = 0;
        int wordLength = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (wordLength > 0) {
                    length = wordLength;
                }
                wordLength = 0;
            } else {
                wordLength++;
            }
        }


        if (wordLength > 0) {
            length = wordLength;
        }

        return length;
    }

    public static int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < i + 2; j++) {

                if (i == nums.length - 2) {
                    if (nums[i] != nums[j]) {
                        return nums[j];
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    if (nums[i] != nums[j]) {
                        return nums[i];
                    } else {
                        continue;
                    }
                }
                if (nums[i] == nums[j] || nums[j] == nums[j + 1]) {
                    continue;
                } else {
                    return nums[j];
                }
            }
        }
        return 0;
    }

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

    public int calc(String s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        int x = scanner.nextInt();
        System.out.println("Input second number:");
        int y = scanner.nextInt();
        System.out.println("Choose operation: \n 1.Sum \n 2.Min \n 3.Multy \n 4.Div");
        int result = x + y;
        return result;
    }

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
