package com.Loops;

public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int countOfSheeps = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == true) {
                countOfSheeps++;
            }
        }
        return countOfSheeps;
    }
}
