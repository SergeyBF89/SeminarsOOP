package org.homeWorkSeminar1.homeTask1.model;

public class Drink extends Product{
    private Integer volume;

    public Drink(String name, Double price, Integer volume) {
        super(name, price);
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }
}
