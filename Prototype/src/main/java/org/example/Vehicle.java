package org.example;

public abstract class Vehicle implements Cloneable{
    private String engine;
    private String model;
    private long price;

    public Vehicle(String model,String engine,long price) {
        this.price = price;
        this.engine = engine;
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    protected Vehicle clone() throws CloneNotSupportedException{
        return (Vehicle) super.clone();
    }

}
