package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        List<Character> list = new ArrayList<>();
        for (char c : arr) {
            list.add(c);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i) == list.get(i + 1))){
               list.remove(i);
               i--;
            }

        }
        StringBuilder result = new StringBuilder();
        for (char c : list) {
            result.append(c);
        }
        return result.toString();
    }
}
