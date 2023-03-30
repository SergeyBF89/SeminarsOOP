package org.Seminar1.classCat;

import org.Seminar1.classCat.model.BengalCat;
import org.Seminar1.classCat.model.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Barsik");
        System.out.println(cat.getName());
        cat.saySomething();
        cat.sayWithInterface();
        BengalCat cat1 = new BengalCat();
        cat1.saySomething();
    }
}
