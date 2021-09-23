package com.Collections;

import java.util.Iterator;
import java.util.List;

public class FilteringEvenNumbers {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        for (Iterator<Integer> iterator = listOfNumbers.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        return listOfNumbers;
    }
}
