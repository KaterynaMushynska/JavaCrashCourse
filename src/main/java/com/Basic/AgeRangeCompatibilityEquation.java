package com.Basic;

public class AgeRangeCompatibilityEquation {
    public static String datingRange(int age) {
        int min = age <= 14 ? (int) (age - 0.1 * age) : age / 2 + 7;
        int max = age <= 14 ? (int) (age + 0.1 * age) : (age - 7) * 2;
        return min + "-" + max;
    }
}
