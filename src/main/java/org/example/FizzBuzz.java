package org.example;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static String fizzBuzz(int n) {
        int[] ar = IntStream.range(1, n).toArray();
        for (int i = 0; i < ar.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        return null;
    }
}
