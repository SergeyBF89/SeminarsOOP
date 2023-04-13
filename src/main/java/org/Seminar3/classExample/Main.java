package org.Seminar3.classExample;

import org.Seminar3.classExample.model.Cat;
import org.Seminar3.classExample.model.CatShelter;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatShelter cats = new CatShelter(List.of(new Cat("name")));
        Iterator<Cat> iterator = cats.iterator();
        cats.getSize();
        if (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
