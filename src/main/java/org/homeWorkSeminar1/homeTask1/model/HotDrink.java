package org.homeWorkSeminar1.homeTask1.model;

public class HotDrink extends Drink{
    private Integer temperature;

    public HotDrink(String name, Double price, Integer volume, Integer temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }
}
