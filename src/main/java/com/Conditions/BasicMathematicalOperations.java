package com.Conditions;

public class BasicMathematicalOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        if (op == "+") {
            return v1 + v2;
        } else if (op == "-") {
            return v1 - v2;
        } else if (op == "*") {
            return v1 * v2;
        } else if (op == "/") {
            return v1 / v2;
        } else {
            return 0;
        }
    }
}
