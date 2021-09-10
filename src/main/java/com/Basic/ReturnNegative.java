package com.Basic;

public class ReturnNegative {
    public static int makeNegative(final int x) {
        if (x > 0) {
            return -x;
        }
        if (x < 0) {
            return x;
        }
        if (x == 0) {
            return 0;
        }
        return 0;
    }
}
