package org.homeWorkSeminar1.homeTask1.model;

import java.util.AbstractList;
import java.util.ArrayList;

public class HotDrinkVendingMachine extends VendingMachine{
    public AbstractList getProduct(String searchName, Integer volume, Integer temperature) {
        AbstractList<Product> tempList = this.getProduct(searchName, volume);

        ArrayList<Product> result = new ArrayList<>();
        for (Product tempItem : tempList) {
            HotDrink item = (HotDrink) tempItem;
            if (item.getTemperature().equals(temperature)) {
                result.add(tempItem);
            }
        }
        return result;
    }
}
