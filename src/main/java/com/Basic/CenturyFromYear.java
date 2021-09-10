package com.Basic;

public class CenturyFromYear {
    public static int century(int number) {
        return (int) (Math.ceil(number / 100.0));
    }
}
