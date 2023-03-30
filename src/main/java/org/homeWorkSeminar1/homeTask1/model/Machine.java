package org.homeWorkSeminar1.homeTask1.model;

import java.util.ArrayList;

public interface Machine {
    ArrayList getProductByName(String searchName);
    ArrayList getProductByPrice(Double searchPrice);
    void addProduct(Product newItem);
}
