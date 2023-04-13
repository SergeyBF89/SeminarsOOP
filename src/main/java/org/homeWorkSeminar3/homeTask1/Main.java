package org.homeWorkSeminar3.homeTask1;

import org.homeWorkSeminar3.homeTask1.model.HotDrink;
import org.homeWorkSeminar3.homeTask1.model.HotDrinkComparator;
import org.homeWorkSeminar3.homeTask1.model.HotDrinkVendingMachine;


public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();
        machine.addProduct(new HotDrink("hot tea:", 50.0, 1, 70));
        machine.addProduct(new HotDrink("hot green tea:", 60.0, 1, 75));
        machine.addProduct(new HotDrink("hot chocolate:", 100.0, 2, 65));
        machine.addProduct(new HotDrink("hot coffee:", 150.0, 2, 65));

        machine.sort(new HotDrinkComparator("temperature"));
        machine.printProduct();
        System.out.println();
        for (Object item : machine) {
            System.out.println("iterated: " + item);
        }


    }
}
