package com.Basic;

public class PixelArtPlanning {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        if (wallLength % pixelSize == 0) {
            return true;
        }
        return false;
    }
}
