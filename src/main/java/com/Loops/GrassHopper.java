package com.Loops;

public class GrassHopper {
    public static int summation(int n) {
        int sum = 0;
        int count = 1;
        while (count <= n) {
            sum += count;
            count += 1;
        }
        return sum;
    }
}
