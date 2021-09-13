package com.String;

public class FindThePosition {
    public static String position(char alphabet) {
        int asciiValueOfinputChar = (int) alphabet;
        int position = asciiValueOfinputChar - 96;
        return "Position of alphabet: " + position;
    }
}
