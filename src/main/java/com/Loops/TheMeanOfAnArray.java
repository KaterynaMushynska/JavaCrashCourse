package com.Loops;

public class TheMeanOfAnArray {
    public static int getAverage(int[] marks) {
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        return total / marks.length;
    }
}
