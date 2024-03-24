package org.example;

import java.util.*;


public class solution {

    public static String compressWord(String word, int k) {
        StringBuilder res = new StringBuilder(word);

        while (hasRepeatingLetters(res.toString(), k)) {
            HashSet<Character> uniqueChars = new HashSet<>();
            StringBuilder tempResult = new StringBuilder();

            for (int i = 0; i < res.length(); i++) {
                char currentChar = res.charAt(i);

                if (countOccurrences(res.toString(), currentChar) < k) {
                    uniqueChars.add(currentChar);
                    tempResult.append(currentChar);
                }
            }

            res = new StringBuilder(tempResult.toString());
        }

        return res.toString();
    }

    private static boolean hasRepeatingLetters(String str, int count) {
        for (char c : str.toCharArray()) {
            if (countOccurrences(str, c) == count) {
                return true;
            }
        }
        return false;
    }

    private static int countOccurrences(String str, char c) {
        return str.length() - str.replace(String.valueOf(c), "").length();

    }


}
