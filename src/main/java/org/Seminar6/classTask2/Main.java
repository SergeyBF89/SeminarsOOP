package org.Seminar6.classTask2;

import org.Seminar6.classTask2.model.Addition;
import org.Seminar6.classTask2.model.Calculator;

public class Main {
    public static void main(String[] args) {
        Addition add = new Addition(1.0, 1.0);
        Calculator calc = new Calculator();
        calc.calculateSwitch(add);
        System.out.println(add.getResult());
    }
}
