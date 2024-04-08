package org.example;

public class Powx {
    public double myPow(double x, int n) {
        double res = 1;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                res *= x;
            }

        } else {

                for(int j = 0;j < -n;j++){
                res *= 1 / x;

            }
        }
   return res; }
}
