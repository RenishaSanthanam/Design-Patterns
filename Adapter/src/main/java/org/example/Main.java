package org.example;

public class Main {
    public static void main(String[] args) {
        SwiggyStore swiggyStore = new SwiggyStore();
        swiggyStore.addItem(new FoodItem());
        swiggyStore.addItem(new GroceryAdapter(new GroceryProduct()));
    }
}