package org.example;

public class ZomatoFacade {

    private Restaurant restaurant;
    private DeliveryTeam deliveryTeam;
    private  DeliveryBoy deliveryBoy;

    public ZomatoFacade(Restaurant restaurant, DeliveryTeam deliveryTeam, DeliveryBoy deliveryBoy) {
        this.restaurant = restaurant;
        this.deliveryTeam = deliveryTeam;
        this.deliveryBoy = deliveryBoy;
    }

    public void placeOrder(){
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickUpOrder();
        deliveryBoy.deliverOrder();
    }
}
