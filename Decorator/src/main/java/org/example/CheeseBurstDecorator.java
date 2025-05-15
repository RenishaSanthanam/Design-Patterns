package org.example;

public class CheeseBurstDecorator extends PizzaDecorator {
    CheeseBurstDecorator(Pizza pizza) {
        super(pizza);
    }

    public String bake(){
        return pizza.bake() + addCheese();
    }


    public String addCheese(){
        return "Cheese Burst added";
    }
}
