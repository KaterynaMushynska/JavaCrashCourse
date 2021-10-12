package com.OOP.AreaCalculations;

public class Calculator {
    public double getTotalArea(Figure... fig) {
        double totalArea = 0;
        for (Figure figure : fig) {
            totalArea += figure.getArea();
        }
        return roundDouble(totalArea);
    }

    public double roundDouble(double d) {

        d = d * 100;
        int i = (int) Math.round(d);
        return (double) i / 100;
    }
}
