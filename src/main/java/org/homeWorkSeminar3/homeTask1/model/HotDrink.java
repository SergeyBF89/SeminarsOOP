package org.homeWorkSeminar3.homeTask1.model;

public class HotDrink extends Drink {
    private Integer temperature;

    public HotDrink(String name, Double price, Integer volume, Integer temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return String.format("name: %s volume: %d temperature: %d",getName(), getVolume(), getTemperature());
    }
}
