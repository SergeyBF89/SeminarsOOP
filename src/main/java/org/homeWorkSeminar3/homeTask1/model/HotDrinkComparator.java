package org.homeWorkSeminar3.homeTask1.model;

import java.util.Comparator;

public class HotDrinkComparator implements Comparator<Product> {
    private String type;

    public HotDrinkComparator(String type) {
        this.type = type;
    }

    @Override
    public int compare(Product o1, Product o2) {
        HotDrink product1 = (HotDrink) o1;
        HotDrink product2 = (HotDrink) o2;
        if (this.type.equals("temperature")) {
            return product1.getTemperature() - product2.getTemperature();
        }
        if (this.type.equals("volume")) {
            return product1.getVolume() - product2.getVolume();
        }
        return 0;
    }
}
