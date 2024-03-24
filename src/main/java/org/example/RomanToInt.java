package org.example;

import java.util.HashMap;

public class RomanToInt {
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
}
