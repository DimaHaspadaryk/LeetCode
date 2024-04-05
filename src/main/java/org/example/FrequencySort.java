package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FrequencySort {
    public String frequencySort(String s) {
        char[] ar = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    char temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        return Arrays.toString(ar);  }
}

