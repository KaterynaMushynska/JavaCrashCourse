package com.Classes;

public class LombokEncapsulation {
    private int number;
    private String stringValue;
    private Object anObject;

    public LombokEncapsulation(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

    public LombokEncapsulation() {
    }

    public int getNumber() {
        return number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

}
