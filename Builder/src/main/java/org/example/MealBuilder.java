package org.example;

public abstract class MealBuilder {

    public  abstract void addCurry();
    public  abstract void addBread();
    public  abstract void addColdDrink();
    public  abstract void addBriyani();
    public  abstract Meal build();
}
