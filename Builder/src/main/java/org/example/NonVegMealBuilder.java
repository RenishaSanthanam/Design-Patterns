package org.example;

public class NonVegMealBuilder extends MealBuilder{
    private Meal meal;

    public NonVegMealBuilder(){
        meal = new Meal();
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Veg");
    }

    @Override
    public void addBread() {
        this.meal.setBread("veg Roll");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("Pepsi");
    }

    @Override
    public void addBriyani() {
        this.meal.setBriyani("Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
