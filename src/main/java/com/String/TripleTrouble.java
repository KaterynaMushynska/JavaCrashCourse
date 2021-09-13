package com.String;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            sb.append("" + one.charAt(i) + two.charAt(i) + three.charAt(i));
        }
        return sb.toString();
    }
}
