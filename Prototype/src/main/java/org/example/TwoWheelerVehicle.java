package org.example;

public class TwoWheelerVehicle extends Vehicle{
    private boolean isElectric;

    public TwoWheelerVehicle(String model,String engine,long price,boolean isElectric){
        super(model,engine,price);
        this.isElectric = isElectric;
    }

    @Override
    protected TwoWheelerVehicle clone() throws CloneNotSupportedException {
        return (TwoWheelerVehicle)super.clone();
    }
}
