package com.Loops;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int total = 0;

        for (int i = 0; i < classPoints.length; i++) {
            total += classPoints[i];
        }
        int average = total / classPoints.length;
        if (yourPoints >= average) {
            return true;
        } else {
            return false;
        }
    }
}
