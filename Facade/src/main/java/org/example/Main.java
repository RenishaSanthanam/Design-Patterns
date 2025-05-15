package org.example;

public class Main {
    public static void main(String[] args) {

       ZomatoFacade zomatoFacade = new ZomatoFacade(new Restaurant(),new DeliveryTeam(),new DeliveryBoy());
       zomatoFacade.placeOrder();
    }
}