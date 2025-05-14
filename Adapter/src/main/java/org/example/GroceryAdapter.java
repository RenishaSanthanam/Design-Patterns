package org.example;

public class GroceryAdapter implements Item{
    GroceryItem item;
    public GroceryAdapter(GroceryItem item){
        this.item = item;
    }

    @Override
    public String getName() {
        return item.getName();
    }

    @Override
    public String getPrice() {
        return item.getPrice();
    }

    @Override
    public String getRestaurant() {
        return item.getStoreName();
    }
}
