package org.homeWorkSeminar3.homeTask1.model;

import java.util.ArrayList;
import java.util.Iterator;

public class HotDrinkVendingMachine extends VendingMachine implements Iterable {
    public ArrayList getProduct(String searchName, Integer volume, Integer temperature) {
        ArrayList<Product> tempList = this.getProduct(searchName, volume);

        ArrayList<Product> result = new ArrayList<>();
        for (Product tempItem : tempList) {
            HotDrink item = (HotDrink) tempItem;
            if (item.getTemperature().equals(temperature)) {
                result.add(tempItem);
            }
        }
        return result;
    }

    public void sort(HotDrinkComparator comparator) {
        list.sort(comparator);
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }
}
