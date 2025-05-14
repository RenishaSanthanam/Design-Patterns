package org.example;

public class MealDirector {
    MealBuilder mealBuilder;
    public  MealDirector(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }

    public Meal prepareMeal(){
        mealBuilder.addCurry();
        mealBuilder.addBread();
        mealBuilder.addColdDrink();
        mealBuilder.addBriyani();
        return mealBuilder.build();
    }

}
