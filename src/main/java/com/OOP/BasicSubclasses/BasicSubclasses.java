package com.OOP.BasicSubclasses;

public class BasicSubclasses {
    public static Human[] create(){
        Human[] people = new Human[2];
        people[0] = new Man();
        people[1] = new Woman();

        return people;

    }
}
