package org.example;

import java.util.Arrays;

public class ScoreOfStrings {
    public int scoreOfString(String s) {
        char[] arr = s.toCharArray();
        int asciiValue = 0;
        int sum = 0;
        for (char i = 0; i < arr.length - 1;i++) {
            asciiValue = (int) i;
            sum =  sum + Math.abs(arr[i] - arr[i + 1]);
        }
        return sum ;
    }
}
