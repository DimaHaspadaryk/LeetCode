package org.example;

public class LenghtOfLast {
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
}
