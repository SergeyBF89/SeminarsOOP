package org.homeWorkSeminar3.homeTask1.model;

import java.util.ArrayList;

public class VendingMachine implements Machine{
    protected ArrayList<Product> list;

    public VendingMachine() {
        list = new ArrayList<>();
    }

    public void addProduct(Product newItem) {
        list.add(newItem);
    }

    public ArrayList getProduct(String searchName, Integer volume) {
        ArrayList<Product> tempList= getProductByName(searchName);
        ArrayList<Product> result = new ArrayList<>();
        for (Product tempItem : tempList) {
            HotDrink item = (HotDrink) tempItem;
            if (item.getVolume().equals(volume)) {
                result.add(tempItem);
            }
        }
        return result;
    }

    public ArrayList getProductByName(String searchName) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product item : list) {
            if (item.getName().contains(searchName)) {
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList getProductByPrice(Double searchPrice) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product item : list) {
            if (item.getPrice().equals(searchPrice)) {
                result.add(item);
            }
        }
        return result;
    }

    public void printProduct() {
        for (Product item : list) {
            System.out.println(item);
        }
    }
}
