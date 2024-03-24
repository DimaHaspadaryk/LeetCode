package org.example;

public class Sqrt {
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
        } else {
            System.out.println(0);
        }

        return (int) sqrtroot;
    }

}
