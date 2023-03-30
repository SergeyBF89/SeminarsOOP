package org.Seminar1.classTask1;

import org.Seminar1.classTask1.model.BottleOfWaterVendingMachine;
import org.Seminar1.classTask1.model.Product;
import org.Seminar1.classTask1.model.ProductWater;
//import org.Seminar1.classTask1.model.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list= new ArrayList<>();
        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(list);

        list.add(new ProductWater("Water", 100.0, 0.5));
        list.add(new ProductWater("Water", 200.0, 1.0));
        ProductWater water = machine.getProduct("Water", 0.5);

        System.out.println(machine.getProduct("Water", 1.0));
    }
}
