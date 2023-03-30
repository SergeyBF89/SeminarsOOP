package org.Seminar1.classTask1.model;

public class ProductWater extends Product{

    private Double volume;

    public ProductWater(String name, Double price) {
        super(name, price);
    }

    public ProductWater(String name, Double price, Double volume) {
        super(name, price);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
