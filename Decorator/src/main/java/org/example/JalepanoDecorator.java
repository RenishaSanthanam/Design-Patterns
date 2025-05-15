package org.example;

public class JalepanoDecorator extends PizzaDecorator{
    JalepanoDecorator(Pizza pizza) {
        super(pizza);
    }

    public String bake(){
        return pizza.bake() + addJalepano();
    }

    public String addJalepano(){
        return "Jalepano added";
    }
}
