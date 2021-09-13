package com.Conditions;

public class DoIGetABonus {
    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus == true) {
            return "\u00A3" + salary * 10;
        }
        if (bonus == false) {
            return "\u00A3" + salary;
        }
        return "\u00A3" + salary;
    }
}
